package com.sinoway.cisp.entitys;
/*报告中本人异议申诉明细的实体*/
public class Dissent {
	private String dissent_id;
	private String appeal_time;
	private String appeal_detail;
	private String status;
	
	
	public Dissent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Dissent(String dissent_id, String appeal_time, String appeal_detail, String status) {
		super();
		this.dissent_id = dissent_id;
		this.appeal_time = appeal_time;
		this.appeal_detail = appeal_detail;
		this.status = status;
	}


	public String getDissent_id() {
		return dissent_id;
	}
	public void setDissent_id(String dissent_id) {
		this.dissent_id = dissent_id;
	}
	public String getAppeal_time() {
		return appeal_time;
	}
	public void setAppeal_time(String appeal_time) {
		this.appeal_time = appeal_time;
	}
	public String getAppeal_detail() {
		return appeal_detail;
	}
	public void setAppeal_detail(String appeal_detail) {
		this.appeal_detail = appeal_detail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
