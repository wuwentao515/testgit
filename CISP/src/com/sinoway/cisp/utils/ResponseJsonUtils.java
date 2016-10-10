package com.sinoway.cisp.utils;

public class ResponseJsonUtils {
    public static String creaRespJson(
    		boolean isCallSuccess,
    		String errorCode,
    		String report) {
    	String result = null;
		result = "{" + "\"success\":";
		if (isCallSuccess) {
			result += "\"true\"";
			if (null != report) {
				result += ",\"detail\":{\"report\":" + report+"}";
			}
		} else {
			result += "\"false\"";
			if (null != errorCode) {
				result += ",\"detail\":{\"ERROR_CODE\":\"" + errorCode + "\"}";
			}
		}
		result += "}";
    	return result;
    }
}
