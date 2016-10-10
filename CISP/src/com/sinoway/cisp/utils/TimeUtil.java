package com.sinoway.cisp.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
	
		//十天前
		public static String nowDate(){
			Calendar curr = Calendar.getInstance();
			curr.set(Calendar.DATE,(curr.get(Calendar.DATE)-10));
			Date dates=curr.getTime();
			
			DateFormat formats=new SimpleDateFormat("yyyy-MM-dd");
			String times=formats.format(dates);
			
			
			return times;
			
			
		}
		
		//六个月前
		public static String nowMonth(){
			Calendar curr = Calendar.getInstance();
			curr.set(Calendar.MONTH,(curr.get(Calendar.MONTH)-6));
			Date dates=curr.getTime();
			
			DateFormat formats=new SimpleDateFormat("yyyy-MM-dd");
			String times=formats.format(dates);
			
			
			return times;
			
			
		}
		
		//两年
		public static String nowYear(){
			Calendar curr = Calendar.getInstance();
			curr.set(Calendar.YEAR,(curr.get(Calendar.YEAR)-2));
			Date dates=curr.getTime();
			
			DateFormat formats=new SimpleDateFormat("yyyy-MM-dd");
			String times=formats.format(dates);
			
			
			return times;
			
			
		}
		

}
