package com.saigonbpo.wsqc.Service;



import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	void init();

    String store(MultipartFile file, String childpath);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();
    
	List<File> getFiles(String pFolder, String pPartten);
}
