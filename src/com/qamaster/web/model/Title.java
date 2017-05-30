package com.qamaster.web.model;

public class Title {
	
	private int titleId;
	private String title;
	private String level;
	private String jobdescription;
	private String paytype;
	private double pay;
	
	public Title() {}
	
	public Title(int titleId, String title, String level, String jobdescription, String paytype, double pay) {
		super();
		this.titleId = titleId;
		this.title = title;
		this.level = level;
		this.jobdescription = jobdescription;
		this.paytype = paytype;
		this.pay = pay;
	}
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	@Override
	public String toString() {
		return "Title [titleId=" + titleId + ", title=" + title + ", level=" + level + ", jobdescription="
				+ jobdescription + ", paytype=" + paytype + "]";
	}
	
	
	
	
}
