package com.sinoway.cisp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WSFileUtil {
	
	public static String getSystemConfigPath(String propertyKey){
		
		String attachroot = "";
		String dateroot ="";
		String fullPath = "";
		
		attachroot = PropertyReader.getSystemProperty(propertyKey);
		dateroot = StringUtil.dateToString(new Date(), "yyyyMMdd");
		fullPath = attachroot + dateroot + "/";
		File file = new File(fullPath);
		if(!file.exists()){
			file.mkdirs();
		}
		return fullPath;
	}
	public static boolean saveFile(String fileTargetPath,String fileName,byte[] fileContent) throws Exception{
		boolean result = false;
		File file = null;
		FileOutputStream fos = null;
		try {
			file = new File(fileTargetPath);
			if(!file.exists())
				file.mkdirs();
			file = new File(fileTargetPath+fileName);
			if(!file.exists()){
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			fos.write(fileContent);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			try {
				if(fos!=null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
