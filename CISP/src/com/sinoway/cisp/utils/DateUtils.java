package com.sinoway.cisp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class DateUtils {
	public static String formatDateMonth(Date date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");
		String _date = dateFormat.format(date);
		
		return _date;
	}

	public static String formatDate(Date date) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String _date = dateFormat.format(date);

		return _date;
	}
	public static String formatDate2(Date date) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String _date = dateFormat.format(date);

		return _date;
	}

	public static String formatDateTime(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String _date = dateFormat.format(date);

		return _date;
	}

	public static Date parseDate(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;

	}
	
	public static Date parseDateTime(String dateStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = null;
		try {
			date = dateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return date;

	}
	
}
