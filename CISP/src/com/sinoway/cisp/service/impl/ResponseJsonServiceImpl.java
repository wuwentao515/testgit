package com.sinoway.cisp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.MessageMapper;
import com.sinoway.cisp.entitys.Message;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.utils.IDUtil;

@Service
public class ResponseJsonServiceImpl implements ResponseJsonService {
	
	@Autowired
	private MessageMapper messageMapper;
	

	@Override
	public String creaRespJson(
			User user,
			String sinoid,
			String name,
			String cardid, 
			boolean isCallSuccess, 
			String errorCode, 
			String report) {
		String result = null;
		result = "{" + "\"success\":";
		if (isCallSuccess) {
			result += "\"true\"";
			if (null != report) {
				Message mess = new Message();
				String token = IDUtil.generateShortUuid();
				mess.setCardid(cardid);
				mess.setInstiCode(user.getInstiCode().toString());
				mess.setName(name);
				mess.setSinoid(sinoid);
				mess.setToken(token.substring(0, 8));
				mess.setUserAccount(user.getUserAccount());
				result += ",\"detail\":{\"token\":\""+token.substring(0, 8)+"\",\"report\":" + report+"}";
				messageMapper.insert(mess);
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
