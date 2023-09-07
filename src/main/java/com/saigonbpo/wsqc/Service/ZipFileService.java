package com.saigonbpo.wsqc.Service;

public interface ZipFileService {

	public String unzipFile(String zipfile, String subfolder) throws Exception;
	
	public String unzipFile(String zipfile, String subfolder, String password) throws Exception;
}
