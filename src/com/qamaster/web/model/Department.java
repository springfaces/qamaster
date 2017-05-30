package com.qamaster.web.model;

public class Department {
	
	private int departmenId;
	private String departmentName;
	private String departmentDes;
	private String departmentCode;
	
	public Department() {}
	
	public Department(int departmenId, String departmentName, String departmentDes, String departmentCode) {
		super();
		this.departmenId = departmenId;
		this.departmentName = departmentName;
		this.departmentDes = departmentDes;
		this.departmentCode = departmentCode;
	}
	public int getDepartmenId() {
		return departmenId;
	}
	public void setDepartmenId(int departmenId) {
		this.departmenId = departmenId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDes() {
		return departmentDes;
	}
	public void setDepartmentDes(String departmentDes) {
		this.departmentDes = departmentDes;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "Department [departmenId=" + departmenId + ", departmentName=" + departmentName + ", departmentDes="
				+ departmentDes + ", departmentCode=" + departmentCode + "]";
	}
	
	
}
