package com.qamaster.web.model;

import java.util.Date;

public class JobHistory {
	
	private int userId;
	private Date startDate;
	private Date endDate;
	private int titleId;
	private double pay;
	
	
	public JobHistory() {} 
	
	public JobHistory(int userId, Date startDate, Date endDate, int titleId, double pay) {
		super();
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.titleId = titleId;
		this.pay = pay;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTitleId() {
		return titleId;
	}
	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "JobHistory [userId=" + userId + ", startDate=" + startDate + ", endDate=" + endDate + ", titleId="
				+ titleId + ", pay=" + pay + "]";
	}
	
	
	

}
