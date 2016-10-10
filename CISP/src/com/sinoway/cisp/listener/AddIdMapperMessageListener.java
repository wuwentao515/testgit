package com.sinoway.cisp.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;

import com.sinoway.cisp.dao.JedisDao;

public class AddIdMapperMessageListener implements MessageListener {
	
	@Autowired
	private JedisDao jedisDao;
	
	@Override
	public void onMessage(Message message) {
		TextMessage tm = (TextMessage) message;
		try {
			String idMapperJson = tm.getText();
			jedisDao.set("idMapper", idMapperJson);
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
