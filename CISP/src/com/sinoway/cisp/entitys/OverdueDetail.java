package com.sinoway.cisp.entitys;


public class OverdueDetail {
	
    private String done_time;

    private String overdue_time;

    private String overdue_level;

    private String overdue_reason;

    private String now_status;
    
    

	public OverdueDetail(String done_time, String overdue_time, String overdue_level, String overdue_reason,
			String now_status) {
		super();
		this.done_time = done_time;
		this.overdue_time = overdue_time;
		this.overdue_level = overdue_level;
		this.overdue_reason = overdue_reason;
		this.now_status = now_status;
	}

	public String getDone_time() {
		return done_time;
	}

	public void setDone_time(String done_time) {
		this.done_time = done_time;
	}

	public String getOverdue_time() {
		return overdue_time;
	}

	public void setOverdue_time(String overdue_time) {
		this.overdue_time = overdue_time;
	}

	public String getOverdue_level() {
		return overdue_level;
	}

	public void setOverdue_level(String overdue_level) {
		this.overdue_level = overdue_level;
	}

	public String getOverdue_reason() {
		return overdue_reason;
	}

	public void setOverdue_reason(String overdue_reason) {
		this.overdue_reason = overdue_reason;
	}

	public String getNow_status() {
		return now_status;
	}

	public void setNow_status(String now_status) {
		this.now_status = now_status;
	}
    
    

}