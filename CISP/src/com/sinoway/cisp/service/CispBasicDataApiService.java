package com.sinoway.cisp.service;

import org.springframework.stereotype.Service;
import com.sinoway.cisp.entitys.User;
@Service
public interface CispBasicDataApiService {
	public String pushCreditData(
			User user, 
			String datatype, 
			String version, 
			String name, 
			String cardid,
			String data)throws Exception;
	public String getCreditData(
			User user, 
			String datatype, 
			String version, 
			String name, 
			String cardid,
			String qreason)throws Exception;
}
