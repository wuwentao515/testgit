package com.sinoway.cisp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringUtil {
	public static String toFirstUppercase(String src) {
		byte[] ss = src.getBytes();
		if (ss[0] >= 97 && ss[0] <= 122) {
			ss[0] = (byte) (ss[0] - 32);
			return new String(ss);
		}
		return src;
	}

	public static String toFirstLowerCase(String src) {
		byte[] ss = src.getBytes();
		if (ss[0] >= 65 && ss[0] <= 90) {
			ss[0] = (byte) (ss[0] + 32);
			return new String(ss);
		}
		return src;
	}

	public static Date stringToDate(String str, String type) throws ParseException {
		if(("").equals(str) ||str == null ){
			return null;
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat(type);
			Date date = sdf.parse(str);
			return date;
		}
	}

	public static String dateToString(Date date, String type) {
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		String datestr = sdf.format(date);
		return datestr;
	}

	public static int StringToInt(String str) throws NumberFormatException {
		return Integer.parseInt(str);
	}
}
