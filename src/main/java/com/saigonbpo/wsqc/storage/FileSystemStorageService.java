package com.saigonbpo.wsqc.storage;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.saigonbpo.wsqc.Service.StorageService;

@Service
public class FileSystemStorageService implements StorageService {

	@Value("${location.upload}")
    private Path rootLocation;


    @Override
    public String store(MultipartFile file, String childpath) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            if(!this.rootLocation.resolve(childpath).toFile().exists()) {
            	this.rootLocation.resolve(childpath).toFile().mkdirs();
            }
            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, this.rootLocation.resolve(childpath + "/" +filename),
                    StandardCopyOption.REPLACE_EXISTING);
            }
            return rootLocation.resolve(childpath + "/" +filename).toString();
        }
        catch (IOException e) {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }

    @Override
    public Stream<Path> loadAll() {
        try {
            return Files.walk(this.rootLocation, 1)
                .filter(path -> !path.equals(this.rootLocation))
                .map(this.rootLocation::relativize);
        }
        catch (IOException e) {
            throw new StorageException("Failed to read stored files", e);
        }

    }

    @Override
    public Path load(String filename) {
        return rootLocation.resolve(filename);
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            }
            else {
                throw new StorageFileNotFoundException(
                        "Could not read file: " + filename);

            }
        }
        catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteAll() {
        FileSystemUtils.deleteRecursively(rootLocation.toFile());
    }

    @Override
    public void init() {
        try {
            Files.createDirectories(rootLocation);
        }
        catch (IOException e) {
            throw new StorageException("Could not initialize storage", e);
        }
    }
    
    
    @Override
    public List<File> getFiles(String pFolder, String pPartten){
    	List<File> result = new ArrayList<File>();
		try {
			
			File pDir = new File(pFolder);
			
			File[] arrayFiles = pDir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.isFile() && isCorectFile(pathname.getName(), pPartten);
				}
			});
			if(arrayFiles != null && arrayFiles.length > 0) {
				for(File f : arrayFiles) {
					result.add(f);
				}
			}
			File[] arrayFolders = pDir.listFiles(new FileFilter() {
				
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.isDirectory();
				}
			});
			if(arrayFolders != null && arrayFolders.length > 0) {
				for(File path : arrayFolders) {
					result.addAll(getFiles(path.getAbsolutePath(), pPartten));
				}
			}

			Collections.sort(result);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return result;
	}
    
    private boolean isCorectFile(String name, String patten) {
		if (patten != null && patten.length() > 0) {
			return name.matches(patten.replace("\\\\", "\\"));
		}
		return true;
	}

}
