package com.sinoway.cisp.utils;



import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public static String getMD5Str(String source) {
		try {
			return process(source).toUpperCase();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static String process(String source) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		// md5 encrypt
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(source.getBytes("UTF-8"));
		byte[] domain = md5.digest();
		StringBuffer md5StrBuff = new StringBuffer();
		// converting domain to String
		for (int i = 0; i < domain.length; i++) {
			if (Integer.toHexString(0xFF & domain[i]).length() == 1) {
				md5StrBuff.append("0").append(Integer.toHexString(0xFF & domain[i])); 
			} else
				md5StrBuff.append(Integer.toHexString(0xFF & domain[i]));
		}	

		return md5StrBuff.toString();	
	}
}
