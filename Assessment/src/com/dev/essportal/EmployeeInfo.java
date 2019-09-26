package com.dev.essportal;

public class EmployeeInfo {

	private int employeeId;
	private String employeeName;
	private String employeeType;
	private String email;
	private String password;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeType="
				+ employeeType + ", email=" + email + "]";
	}
	
	
}
