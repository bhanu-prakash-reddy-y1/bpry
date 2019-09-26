package com.dev.essportal;

public class EmployeeLeaveInfo {

	private int employeeId;
	private String leaveDate;
	private String leaveStatus;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	@Override
	public String toString() {
		return "EmployeeLeaveInfo [employeeId=" + employeeId + ", leaveDate=" + leaveDate + ", leaveStatus="
				+ leaveStatus + "]";
	}
	
	
}
