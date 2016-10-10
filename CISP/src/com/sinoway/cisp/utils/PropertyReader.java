package com.sinoway.cisp.utils;

import java.util.Locale;
import java.util.ResourceBundle;


public class PropertyReader {
	private static String getProperty(String relativeFilePath, String key){
		String result = "";
		try{
			ResourceBundle resouces;
			resouces = ResourceBundle.getBundle(relativeFilePath, Locale.getDefault());
			result = resouces.getString(key);
		}catch(Exception e){
			throw new RuntimeException("系统参数读取失败("+key+")");
		}
		return result;
	}
	
	public static String getSystemProperty(String key){
		return getProperty("SystemConfig", key);
	}
	
	public static String getInfoProperty(String key){
		return getProperty("properties.info", key);
	}
	
	public static String getErrorProperty(String key){
		return getProperty("properties.error", key);
	}
}
