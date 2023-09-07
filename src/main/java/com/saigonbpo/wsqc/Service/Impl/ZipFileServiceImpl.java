package com.saigonbpo.wsqc.Service.Impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.saigonbpo.wsqc.Service.ZipFileService;

import net.lingala.zip4j.core.ZipFile;

@Service
public class ZipFileServiceImpl implements ZipFileService{
	
	@Value("${location.upload}")
	private String unzip_path;

	@Override
	public String unzipFile(String zipfile, String subfolder) throws Exception {
		// TODO Auto-generated method stub
		return unzipFile(zipfile, subfolder, "");
	}

	@Override
	public String unzipFile(String zipfile, String subfolder, String password) throws Exception {
		File file = new File(zipfile);
		String unzipPath = this.unzip_path + File.separator  + subfolder + File.separator + file.getName().replaceAll("\\.[a-zA-Z0-9]+$", "");
		File path = new File(unzipPath);
		path.mkdirs();
		ZipFile zipFile = new ZipFile(zipfile);
		System.out.println(unzipPath);
		// Extracts all files to the path specified
		zipFile.extractAll(unzipPath);
		
		//ExtractItemsSimple.extractFile(zipfile, password, unzipPath);
		return unzipPath;
	}
	
	
}
