package com.sinoway.cisp.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sinoway.cisp.dao.ContractAcceptDetailMapper;
import com.sinoway.cisp.dao.IdMapperMapper;
import com.sinoway.cisp.dao.OverdueStatusMapper;
import com.sinoway.cisp.entitys.ContractAcceptDetail;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample;
import com.sinoway.cisp.entitys.ContractAcceptDetailExample.Criteria;
import com.sinoway.cisp.entitys.IdMapper;
import com.sinoway.cisp.entitys.OverdueStatus;
import com.sinoway.cisp.entitys.OverdueStatusExample;
import com.sinoway.cisp.entitys.User;
import com.sinoway.cisp.service.CispBasicApiService;
import com.sinoway.cisp.service.ReportService;
import com.sinoway.cisp.service.ResponseJsonService;
import com.sinoway.cisp.service.SearchService;
import com.sinoway.cisp.utils.DateUtils;
import com.sinoway.cisp.utils.JsonUtils;
import com.sinoway.cisp.utils.ListSortUtil;
import com.sinoway.cisp.utils.ResponseJsonUtils;

@Component("collectionService")
public class CollectionServiceImpl implements CispBasicApiService {

	IdMapper idMapper=new IdMapper();
	
	
	@Autowired
	private ContractAcceptDetailMapper contractAcceptDetailMapper;
	@Autowired
	private OverdueStatusMapper overdueStatusMapper;
	OverdueStatus ods = new OverdueStatus();
	@Autowired
	private ReportService reportService;
	@Autowired
	private SearchService searchService;

	@Autowired
	private ResponseJsonService responseJsonService;
	@Autowired
	private IdMapperMapper idMapperMapper;
	
	
	
	@Override
	public String pushLoanInfo(User user, String cmd, String isgetreport, String version, String name, String cardid,
			String crid, String data) {
		// TODO Auto-generated method stub

		String result = null;
		String errorCode = null;
		try {
			JSONObject jsonObject = new JSONObject(data);
			JSONObject json = jsonObject.getJSONObject("overdue_info");
			String overdue_start_time = (String) json.get("overdue_start_time");// 逾期开始时间
			String overdue_duration = (String) json.get("overdue_duration");// 逾期时长
			String overdue_reason = (String) json.get("overdue_reason");// 逾期原因
			String overdue_status = (String) json.get("overdue_status");// 逾期状态
			// 得到sinoid
			ContractAcceptDetailExample example = new ContractAcceptDetailExample();
			Criteria criteria = example.createCriteria();
			criteria.andContractIdEqualTo(crid);
			List<ContractAcceptDetail> list = contractAcceptDetailMapper.selectByExample(example);
			if (null != list) {
				String sinoid = list.get(0).getSinoid();
				// 得到sn
				OverdueStatusExample example1 = new OverdueStatusExample();
				com.sinoway.cisp.entitys.OverdueStatusExample.Criteria createCriteria = example1.createCriteria();
				createCriteria.andSinoidEqualTo(sinoid);
				// 得到所用的OverdueStatus对象
				List<OverdueStatus> list1 = overdueStatusMapper.selectByExample(example1);

				if (null != list1) {
					ListSortUtil<OverdueStatus> sortList = new ListSortUtil<OverdueStatus>();
					// 倒叙
					sortList.sort(list1, "colSn", "desc");
					System.out.println(list1.get(0).getColSn());
					String sn = list1.get(0).getColSn();
					ods.setSinoid(sinoid);
					ods.setColSn(String.valueOf(Integer.parseInt(sn) + 1));
					ods.setPaymentLevel(Integer.valueOf(overdue_duration));
					ods.setOverdueStartTime(DateUtils.parseDate(overdue_start_time));
					ods.setOverdueReason(overdue_reason);
					ods.setOverdueStatusMark(overdue_status);
					ods.setSinotime(new Date());
					int i = overdueStatusMapper.insertSelective(ods);

					if (i < 0) {
						// 数据插入错误
						errorCode = "1005";
						// result =ResponseJsonUtils.creaRespJson(false,
						// errorCode, null);
						result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);
					} else {
						if ("1".equals(isgetreport)) {
							try {
                                //进行修改idMapper中状态
								IdMapper selectByPrimaryKey = idMapperMapper.selectByPrimaryKey(sinoid);
								selectByPrimaryKey.setCrStatus(overdue_status);
								selectByPrimaryKey.setSinotime(new Date());
								idMapperMapper.updateByPrimaryKey(selectByPrimaryKey);

								searchService.insSearchReport(user, sinoid, "3", null, ods.getSinotime(), name,
										cardid, new Date());
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

				} else {
					// 该用户以前没有逾期行为
					errorCode = "1100";
					// result =ResponseJsonUtils.creaRespJson(false, errorCode,
					// null);
					result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

				}

			} else {
				// 合同号不存在
				errorCode = "1101";
				// result =ResponseJsonUtils.creaRespJson(false, errorCode,
				// null);

				result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

			}

			// return data;
		} catch (JSONException e) {

			e.printStackTrace();
			// json解析错误
			errorCode = "1004";
			// result =ResponseJsonUtils.creaRespJson(false, errorCode, null);
			result = responseJsonService.creaRespJson(null, null, null, null, false, errorCode, null);

		}
		// }

		return result;

	}

}
