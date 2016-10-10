package com.sinoway.cisp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.BlackListMapper;
import com.sinoway.cisp.entitys.BLackListVo;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.BlackListReportService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.JsonUtils;

@Service
public class BlackListReportServiceImpl implements BlackListReportService {
	@Autowired
	private BlackListMapper mapper;
	
	@Value("${memberAgency}")
	String member;
	
	public String getReport(
			String name,
			String cardid,
			User user) throws Exception {
		String instiCode = user.getInstiCode()+"";
		String userType = user.getUserType();
		// 查询机构简称
		String shortName = mapper.selectShortName(user.getInstiCode() + "");

		List<BLackListVo>  listToShow = mapper.selectByExample(name,cardid);
		for (BLackListVo list : listToShow) {
			
			String formatDate2 = DateUtils.formatDate2(DateUtils.parseDateTime(list.getPublic_time()));
			list.setPublic_time(formatDate2);
			String OverdueStartTime = DateUtils.formatDate2(DateUtils.parseDateTime(list.getOverdue_start_time()));
			list.setOverdue_start_time(OverdueStartTime);
			String[] split = list.getSinoid().split("-");
			String insti = split[2];
			if (insti.equals(instiCode)) {
				list.setComment("1");
			} else {
				list.setComment("3");
			}
			if (member.equals(userType)) {
				list.setData_source("会员机构");
			} else {
				list.setData_source(shortName);
			}
			
			
		}


		String jsonString = JsonUtils.objectToJson(listToShow);

		
		
		return jsonString;
	}
}