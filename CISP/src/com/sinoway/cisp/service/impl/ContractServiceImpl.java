package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.Session;
//import javax.jms.TextMessage;

//import org.apache.activemq.command.ActiveMQTopic;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.ContractDelayHistoryMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.LoanApplicationMapper;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.ContractDelayHistory;
import com.sinoway.cisp.entitys.ContractDelayHistoryExample;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.IdMapperExample;
import com.sinoway.cisp.entitys.IdMapperExample.Criteria;
import com.sinoway.cisp.entitys.LoanApplication;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CheckEntityService;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;
//import com.sinoway.cisp.utils.JsonUtils;

@Component(value = "ContractService")
public class ContractServiceImpl implements CispBasicApiService {
	@Autowired
	private IdMapperMapper idMapperMapper;
	@Autowired
	private LoanApplicationMapper loanApplicationMapper;
	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;
	@Autowired
	private ContractDelayHistoryMapper contractDelayHistoryMapper;
	@Autowired
	private ReportService reportService;
	@Autowired
	private SearchService searchService;
	@Autowired
	private CheckEntityService<ContractAcceptDetail> checkEntityService;
	@Autowired
	private ResponseJsonService responseJsonService;
//	@Autowired
//	private JmsTemplate jmsTemplate;
//	@Autowired
//	private ActiveMQTopic activeMQTopic;

	@Override
	public String pushLoanInfo(User user, String cmd, String isgetreport, String version, String name, String cardid,
			String crid, String data) {
		String reqReason = null;
		String result = responseJsonService.creaRespJson(user, null, name, cardid, false, "1011", null);// 权限不足

		IdMapperExample idMapperExample = new IdMapperExample();
		Criteria criteria = idMapperExample.createCriteria();
		criteria.andInstiidEqualTo(crid);
		List<IdMapper> list = idMapperMapper.selectByExample(idMapperExample);
		if (list.size() == 0) {
			return responseJsonService.creaRespJson(user, null, name, cardid, false, "1008", null);// 没有该进件
		}

		for (IdMapper idMapper : list) {
			if (idMapper.getInstiCode().equals(user.getInstiCode().toString())) {
				String sinoid = idMapper.getSinoid();
				LoanApplication loanApplication = loanApplicationMapper.selectByPrimaryKey(sinoid);

				String nowTimeStr = DateUtils.formatDate2(new Date());
				Date nowTime = DateUtils.parseDate(nowTimeStr);
				Date date = new Date();
				try {
					JSONObject jsonObject = new JSONObject(data);
					JSONObject opJson = jsonObject.getJSONObject("op");
					JSONObject loanInfoJson = jsonObject.getJSONObject("loan_info");
					String option = null;
					@SuppressWarnings("rawtypes")
					Iterator keys = opJson.keys();
					while (keys.hasNext()) {
						option = (String) keys.next();
					}
					if (null == option) {
						return responseJsonService.creaRespJson(user, null, name, cardid, false, "1009", null);
					}
					// 判断合同状态
					String requestResult = loanApplication.getRequestResult();
					if (requestResult != null || !"".equals(requestResult)) {
						if ("1".equals(requestResult) || "2".equals(requestResult) || "4".equals(requestResult)) {
							return responseJsonService.creaRespJson(user, null, name, cardid, false, "1010", null);
						}/*else if("2".equals(requestResult)){
								return responseJsonService.creaRespJson(user, null, name, cardid, false, "1114", null);
							}else if("4".equals(requestResult)){
								return responseJsonService.creaRespJson(user, null, name, cardid, false, "1115", null);
						}*/
					}
					if ("accept".equals(option)) {
						ContractAcceptDetail contractAcceptDetail = new ContractAcceptDetail();

						reqReason = "5";// 查询原因：同意贷款
						idMapper.setCrStatus("11");// 设置id映射，合同状态为同意贷款
						loanApplication.setRequestResult("1");// 封装申请结果，同意贷款

						JSONObject acceptJson = opJson.getJSONObject("accept");
						idMapper.setContractId(acceptJson.getString("contract_id"));
						contractAcceptDetail.setSinoid(sinoid);
						contractAcceptDetail.setContractStatus("1");
						contractAcceptDetail.setContractId(acceptJson.getString("contract_id"));
						contractAcceptDetail.setPayPeriod(acceptJson.getString("pay_period"));
						contractAcceptDetail.setStartTime(DateUtils.parseDate(acceptJson.getString("start_time")));
						contractAcceptDetail.setStopTime(DateUtils.parseDate(acceptJson.getString("stop_time")));
						BigDecimal bigDecimal = new BigDecimal(loanInfoJson.getString("contract_sum"));
						contractAcceptDetail.setContractSum(bigDecimal);
						contractAcceptDetail.setContractType(acceptJson.getString("contract_type"));
						contractAcceptDetail.setGuaraType(acceptJson.getString("guara_type"));
						contractAcceptDetail.setPayLocation(acceptJson.getString("pay_location"));
						contractAcceptDetail.setSinotime(nowTime);

						String chk = checkEntityService.check(idMapper, contractAcceptDetail);
						if (null != chk) {
							result = responseJsonService.creaRespJson(user, sinoid, name, cardid, false, chk, null);
							return result;
						}
						contractAcceptDetailMapper.insert(contractAcceptDetail);

					} else if ("refuse".equals(option)) {
						reqReason = "6";// 查询原因：拒绝贷款
						idMapper.setCrStatus("12");// 拒绝贷款
						loanApplication.setRequestResult("2");// 封装申请结果，拒绝贷款
						JSONObject refuseJson = opJson.getJSONObject("refuse");
						loanApplication.setRefuseReason(refuseJson.getString("refuse_reason"));
						loanApplication.setRefuseTime(DateUtils.parseDate(refuseJson.getString("refuse_time")));
					} else if ("delay".equals(option)) {

						ContractDelayHistoryExample example = new ContractDelayHistoryExample();
						com.sinoway.cisp.entitys.ContractDelayHistoryExample.Criteria createCriteria = example
								.createCriteria();
						createCriteria.andSinoidEqualTo(sinoid);
						List<ContractDelayHistory> selectByExample = contractDelayHistoryMapper
								.selectByExample(example);
						ContractDelayHistory contractDelayHistory = new ContractDelayHistory();
						contractDelayHistory.setSinoid(sinoid);
						contractDelayHistory.setSinotime(new Date());
						if (selectByExample.size() == 0) {
							contractDelayHistory.setSn(String.valueOf(1));
						} else {
							int max = 0;
							for (ContractDelayHistory contractDelayHistory2 : selectByExample) {
								String sn = contractDelayHistory2.getSn();
								if (Integer.parseInt(sn) > max) {
									max = Integer.parseInt(sn);
								}
								max += max;
							}
							contractDelayHistory.setSn(String.valueOf(max));
						}
						contractDelayHistoryMapper.insert(contractDelayHistory);

						reqReason = "7";// 查询原因：延迟贷款
						idMapper.setCrStatus("13");// 延迟贷款
						loanApplication.setRequestResult("3");// 封装申请结果，延迟处理

					} else if ("clientcancel".equals(option)) {
						reqReason = "8";// 查询原因：客户取消
						idMapper.setCrStatus("14");// 客户取消
						loanApplication.setRequestResult("4");// 封装申请结果，客户取消
					} else {
						return responseJsonService.creaRespJson(user, null, name, cardid, false, "1106", null);
					}

					idMapperMapper.updateByPrimaryKey(idMapper);
					//发送消息
//					jmsTemplate.send(activeMQTopic, new MessageCreator() {
//						TextMessage createTextMessage = null;
//						
//						@Override
//						public Message createMessage(Session session) throws JMSException {
//							try {
//								createTextMessage = session.createTextMessage(JsonUtils.objectToJson(idMapper));
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//							return createTextMessage;
//						}
//					});
					
					loanApplicationMapper.updateByPrimaryKey(loanApplication);
					searchService.insSearchReport(user, sinoid, reqReason, null, date, name, cardid, date);
					List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
					if (isgetreport.equals("1")) {
						result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
								report.get(0));
					} else {
						result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null, null);
					}
				} catch (Exception e) {
					e.printStackTrace();
					result = responseJsonService.creaRespJson(user, null, name, cardid, false, "1003", null);
				}
			}
		}
		return result;
	}

}
