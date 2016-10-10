package com.sinoway.cisp.service;

import java.util.Map;

public interface StatisticService {
	//正常结清
    int zsettle(String s);
    //正常未清	
    int zoutstanding(String s);
    //近6个月待审
    int  trial(String s);
    
    //近6个月通过
    int pass(String s);
    //近6个月未通过
    int upass(String s);
    //近6个月取消
    int cancel(String s);
    //
    int ysettle(String s);
    //正常未清
    int youtstanding(String s);
    //近两年的查询纪录
    int serchHis(String s);
    //int zsettle(Map map);
}
