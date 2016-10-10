package com.sinoway.cisp.service;

import com.sinoway.cisp.entitys.User;

public interface ResponseJsonService {
	public String creaRespJson(User user,String sinoid,String name,String cardid, boolean isCallSuccess, String errorCode, String report);
}
