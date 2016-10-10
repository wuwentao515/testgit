package com.sinoway.cisp.service;

import org.springframework.stereotype.Service;
@Service
public interface CheckSignService {
	public String check(
			String key, 
			String sign, 
			String cmd, 
			String isgetreport, 
			String version, 
			String name,
			String cardid,
			String crid);
	public String check(
			String key,
			String sign,
			String datatype,
			String version,
			String name,
			String cardid);
}
