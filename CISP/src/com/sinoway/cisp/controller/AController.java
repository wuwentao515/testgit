package com.sinoway.cisp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinoway.cisp.service.TestRedis;
@Controller
@RequestMapping("/aa")
public class AController {
	
	@Autowired
	private TestRedis testRedis;
	
	@RequestMapping("/bb")
	public @ResponseBody void test(@RequestParam String userAccount){
		
		 String  s=testRedis.insertRedis(userAccount);
		 System.out.println(s);
		
	}
}
