package com.sinoway.cisp.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.InventoryMapper;
import com.sinoway.cisp.dao.OverdueStatusMapper;
import com.sinoway.cisp.dao.PaidMonthlyAmountMapper;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.Inventory;
import com.sinoway.cisp.entitys.OverdueStatus;
import com.sinoway.cisp.entitys.PaidMonthlyAmount;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.IDUtil;
import com.sinoway.cisp.utils.ResponseJsonUtils;

@Component("inventoryService")
public class InventoryServiceImpl implements CispBasicApiService {
	ContractAcceptDetail contractAcceptDetail = new ContractAcceptDetail();
	OverdueStatus overdueStatus = new OverdueStatus();

	PaidMonthlyAmount paid = new PaidMonthlyAmount();

	Inventory inventory = new Inventory();

	IdMapper idMapper = new IdMapper();
	@Autowired
	private OverdueStatusMapper overdueStatusMapper;
	@Autowired
	private PaidMonthlyAmountMapper paidMonthlyAmountMapper;

	@Autowired
	private InventoryMapper inventoryMapper;

	@Autowired
	private ReportService reportService;
	@Autowired
	private SearchService searchService;
	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;
	@Autowired
	private ResponseJsonService responseJsonService;

	@Autowired
	private IdMapperMapper idMapperMapper;

	@Override
	public String pushLoanInfo(User user, String cmd, String isgetreport, String version, String name, String cardid,
			String crid, String data) {
		String errorCode = null;
		String result = null;
		Date d = new Date();

		String sinoid = IDUtil.getSinoId(user.getInstiCode().toString(), "S");

		try {
            //合同同意表中数据
			JSONObject jsonobj = new JSONObject(data);
			JSONObject json1 = jsonobj.getJSONObject("loan_info");
			String contract_money = (String) json1.get("contract_money");
			String contract_start_time = (String) json1.get("contract_start_time");
			String contract_end_time = (String) json1.get("contract_end_time");
			String loan_type = (String) json1.get("loan_type");
			String loan_guarantee_type = (String) json1.get("loan_guarantee_type");
			String pay_period = (String) json1.getString("pay_period");
			String pay_location = (String) json1.get("pay_location");
			
			contractAcceptDetail.setContractId(crid);
			contractAcceptDetail.setSinoid(sinoid);
			contractAcceptDetail.setContractSum(new BigDecimal(contract_money));
			contractAcceptDetail.setStartTime(DateUtils.parseDate(contract_start_time));
			contractAcceptDetail.setStopTime(DateUtils.parseDate(contract_end_time));
			contractAcceptDetail.setContractType(loan_type);
			contractAcceptDetail.setGuaraType(loan_guarantee_type);
			contractAcceptDetail.setPayPeriod(pay_period);
			contractAcceptDetail.setPayLocation(pay_location);
			contractAcceptDetail.setSinotime(d);
			contractAcceptDetailMapper.insertSelective(contractAcceptDetail);
			
			idMapper.setSinoid(sinoid);
			idMapper.setContractId(crid);
			idMapper.setDataFrom("4");
			idMapper.setName(name);
			idMapper.setCardid(cardid);
			idMapper.setCrStatus("1");
			idMapper.setSinotime(d);
			idMapper.setInstiid("");
			// 机构编号
			Integer s = user.getInstiCode();
			idMapper.setInstiCode(String.valueOf(user.getInstiCode()));
			idMapperMapper.insertSelective(idMapper);
			/*//返回报告
			try {
				List<String> report1 = new ArrayList<String>(reportService.getReport(cardid, user));
				searchService.insSearchReport(user, sinoid, "4", report1.get(2), d, name, cardid, d);
				result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
						report1.get(0));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				// 返回报告错误
				errorCode = "1102";
				// result =ResponseJsonUtils.creaRespJson(false,
				// errorCode, null);
				result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
						null);

			}
			*/
			
			// 进行判断是否用op 或者
			Iterator<String> iterator = jsonobj.keys();
			String op = null;
			while (iterator.hasNext()) {
				op = iterator.next();
			}

			//if ("op".equals(op)) {

				JSONObject json2 = jsonobj.getJSONObject("op");	
				String str = null;
				Iterator<String> keys = json2.keys();
				while (keys.hasNext()) {
					str = keys.next();
				}
				JSONObject j = json2.getJSONObject(str);

				if ("overdue_info".equals(str)) {
					// 进行插入到逾期表中
					String overdue_start_time = (String) j.get("overdue_start_time");
					String overdue_duration = (String) j.get("overdue_duration");
					String overdue_reason = (String) j.get("overdue_reason");
					String overdue_status = (String) j.get("overdue_status");

					overdueStatus.setSinoid(sinoid);
					overdueStatus.setOverdueStartTime(DateUtils.parseDate(overdue_start_time));
					overdueStatus.setPaymentLevel(Integer.valueOf(overdue_duration));
					overdueStatus.setOverdueReason(overdue_reason);
					overdueStatus.setOverdueStatusMark(overdue_status);
					overdueStatus.setColSn("1");
					overdueStatus.setSinotime(d);
					int i = overdueStatusMapper.insertSelective(overdueStatus);

					if (i < 0) {
						// 数据插入错误
						errorCode = "1005";
						// result =ResponseJsonUtils.creaRespJson(false,
						// errorCode,
						// null);
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

					} else {
						// 修改合同同意表中的数据

						ContractAcceptDetail selectByPrimaryKey2 = contractAcceptDetailMapper
								.selectByPrimaryKey(sinoid);
						selectByPrimaryKey2.setSinotime(d);
						selectByPrimaryKey2.setContractStatus("4");
						contractAcceptDetailMapper.updateByPrimaryKey(selectByPrimaryKey2);
						// idMapper
						// 修改idMapper的状态
						IdMapper selectByPrimaryKey = idMapperMapper.selectByPrimaryKey(sinoid);
						selectByPrimaryKey.setSinotime(new Date());
						selectByPrimaryKey.setCrStatus(overdue_status);
						idMapperMapper.updateByPrimaryKey(selectByPrimaryKey);
						// result =ResponseJsonUtils.creaRespJson(true, null,
						// null);
						if ("1".equals(isgetreport)) {
							try {
								searchService.insSearchReport(user, sinoid, "4", null, d, name, cardid, d);
								List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
								result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
										report.get(0));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								// 返回报告错误
								errorCode = "1102";
								result = ResponseJsonUtils.creaRespJson(false, errorCode, null);

							}
						}
					}
					// overdue_info if end
				} else if ("loan_info".equals(str)) {
					String last_time_paid = (String) j.get("last_time_paid");
					String unpaid_money = (String) j.getString("unpaid_money");
					String current_bill_money = (String) j.getString("current_bill_money");

					paid.setPaidMoney(new BigDecimal(current_bill_money));
					paid.setPaidTime(DateUtils.parseDate(last_time_paid));
					paid.setPaymentnumber(1);
					paid.setSinoid(sinoid);
					paid.setSinotime(d);
					paidMonthlyAmountMapper.insertSelective(paid);

					inventory.setSinoid(sinoid);
					inventory.setNotRepayMoney(new BigDecimal(unpaid_money));
					inventory.setPaymentDate(DateUtils.parseDate(last_time_paid));
					inventory.setCurrentMoney(new BigDecimal(current_bill_money));
					inventory.setSinotime(d);
					int i = inventoryMapper.insert(inventory);
					if (i < 0) {
						// 数据插入错误
						errorCode = "1005";
						// result =ResponseJsonUtils.creaRespJson(false,
						// errorCode,
						// null);
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

					} else {

						// result =ResponseJsonUtils.creaRespJson(true, null,
						// null);
						if ("1".equals(isgetreport)) {
							try {

								searchService.insSearchReport(user, sinoid, "4", null, d, name, cardid, d);
								List<String> report = new ArrayList<String>(reportService.getReport(cardid, user));
								result = responseJsonService.creaRespJson(user, sinoid, name, cardid, true, null,
										report.get(0));
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								// 返回报告错误
								errorCode = "1102";
								// result =ResponseJsonUtils.creaRespJson(false,
								// errorCode, null);
								result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode,
										null);

							}
						}
					}

					// loan_info if end
				}

				// op if end
			//}

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			errorCode = "1004";
			// result =ResponseJsonUtils.creaRespJson(false, errorCode, null);
			result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);
		}
		return result;
	}

}
