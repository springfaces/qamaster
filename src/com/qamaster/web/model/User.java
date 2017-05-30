package com.qamaster.web.model;

public class User {

	private int id;
	private String username;
	private String password;
	private String email;
	private boolean enabled = false;
	private String authority;
	private Department department;
	private Title title;
	private JobHistory jobHistory;

	public User() {
	}
	
	public User(int id, String username, String password, String email, boolean enabled, String authority,
			Department department, Title title, JobHistory jobHistory) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
		this.department = department;
		this.title = title;
		this.jobHistory = jobHistory;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public JobHistory getJobHistory() {
		return jobHistory;
	}

	public void setJobHistory(JobHistory jobHistory) {
		this.jobHistory = jobHistory;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", enabled=" + enabled + ", authority=" + authority + ", department=" + department + ", title="
				+ title + ", jobHistory=" + jobHistory + "]";
	}

	
}
