package com.sinoway.cisp.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.ReportMapper;


import com.sinoway.cisp.service.StatisticService;

@Service
public class StatisticServiceImpl implements StatisticService {
	@Autowired
    private ReportMapper  reportMapper;
	
	
	@Override
	public int zsettle(String s) {
		// TODO Auto-generated method stub
	 int i=reportMapper.zsettle(s);
		
		return i;
	}

	@Override
	public int zoutstanding(String s) {
		int i=reportMapper.zoutstanding(s);
		return i;
	}

	@Override
	public int trial(String s) {
		// TODO Auto-generated method stub
	 int i=	reportMapper.trial(s);
		return i;
	}

	@Override
	public int pass(String s) {
		// TODO Auto-generated method stub
		int i=reportMapper.pass(s);
		return i;
	}

	@Override
	public int upass(String s) {
		// TODO Auto-generated method stub
	 int i=	reportMapper.upass(s);
		return i;
	}

	@Override
	public int cancel(String s) {
		// TODO Auto-generated method stub
		 int i=reportMapper.cancel(s);
		return i;
	}

	@Override
	public int ysettle(String s) {
		// TODO Auto-generated method stub
		 int i=reportMapper.ysettle(s);
		return i;
	}

	@Override
	public int youtstanding(String s) {
		// TODO Auto-generated method stub
		int i=reportMapper.youtstanding(s);
		return i;
	}

	@Override
	public int serchHis(String s) {
		int i=reportMapper.serchHis(s);
		return i;
	}
	
	
}
