package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.JedisDao;
import com.sinoway.cisp.dao.LoanApplicationMapper;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.LoanApplication;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CheckEntityService;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.IDUtil;
import com.sinoway.cisp.utils.JsonUtils;

@Component(value="LoanService")
public class LoanServiceImpl implements CispBasicApiService {

		// 注入service
		@Autowired
		private LoanApplicationMapper loanApplicationMapper;
		@Autowired
		private IdMapperMapper idMapperMapper;
		@Autowired
		private CheckEntityService<LoanApplication> checkEntityService;
		@Autowired
		private SearchService searchService;
		@Autowired
		private ReportService reportService;
		@Autowired
		private ResponseJsonService responseJsonService;
		@Autowired
		private JedisDao jedisDao;

		public String pushLoanInfo(
				User user,
				String cmd, 
				String isgetreport, 
				String version, 
				String name,
				String cardid,
				String crid,
				String data){
			/*
			 * 0.业务判断：仅根据以上参数,但不用解析data json串
			 * 1.JSON串解析
			 * 2.业务实体类属性设置
			 * 3.业务判断：申请编号重复/日期限制等
			 * 4.入库
			 * 5.获取征信报告
			 * 6.更新查询表
			 * 7.返回
			 * */
			
			String result = null;
			
			Date date = new Date();

			try {
				JSONObject jsonObject = new JSONObject(data);
				JSONObject json1 = jsonObject.getJSONObject("basic_info");
				JSONObject json2 = jsonObject.getJSONObject("loan_info");
				
				String sinoid = IDUtil.getSinoId(user.getInstiCode().toString(), "S");
				String sinoTimeStr = DateUtils.formatDate2(new Date());
				Date sinotime = DateUtils.parseDate(sinoTimeStr);
				
				// 封装idMapper
				IdMapper idMapper = new IdMapper();
				idMapper.setSinoid(sinoid);
				idMapper.setInstiCode(user.getInstiCode().toString());
				idMapper.setInstiid(crid);
				idMapper.setCardid(cardid);
				idMapper.setName(name);
				idMapper.setDataFrom("2222");// 来源于接口
				idMapper.setCrStatus("15");//待审批
				idMapper.setSinotime(sinotime);
				// 封装进件
				LoanApplication loanApplication = new LoanApplication();
				loanApplication.setSinoid(sinoid);
				loanApplication.setName(name);
				loanApplication.setCardid(cardid);
				loanApplication.setRequestResult("0");// 待审批
				loanApplication.setCellPhoneNum(json1.getString("cell_phone_num"));
				loanApplication.setEdu(json1.getString("edu"));
				loanApplication.setRequestLocation(json2.getString("request_location"));
				loanApplication.setRequestType(json2.getString("request_type"));
				loanApplication.setRequestMoney(new BigDecimal(json2.getString("request_money")));
				loanApplication.setSinotime(sinotime);
				loanApplication.setRequestTime(DateUtils.parseDate(json2.getString("request_time")));
				
				
				String chk = checkEntityService.check(idMapper, loanApplication);
				if ( null != chk ){
					result = responseJsonService.creaRespJson(user,sinoid,name,cardid,false, chk, null);
					return result;
				}
				try{
					loanApplicationMapper.insert(loanApplication);
					idMapperMapper.insert(idMapper);
					jedisDao.set("idMapper", JsonUtils.objectToJson(idMapper));//将idMapper放入redis中
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException();
				}
				
				searchService.insSearchReport(user, sinoid, "1", null,date, name, cardid, date);
				List<String> report = new ArrayList<String>(reportService.getReport(cardid,user));
				
				if ( isgetreport.equals("1") ){
					result = responseJsonService.creaRespJson(user,sinoid,name,cardid, true, null, report.get(0));
					
				} else {
					result = responseJsonService.creaRespJson(user,sinoid,name,cardid,true, null, null);
				}

			} catch (Exception e) {
				result = responseJsonService.creaRespJson(user,null,name,cardid,false, "1003", null);
			}

			return result;
		}

}
