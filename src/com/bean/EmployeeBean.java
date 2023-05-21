package com.bean;

import java.sql.Date;

public class EmployeeBean {

	private int eId;
	private String eName;
	private String eEmail;
	private String ePassword;
	private int eAge;
	private Date eJoiningDate;
	private Date eBirtDate;
	private double eSalary;
	private boolean status;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public String getePassword() {
		return ePassword;
	}

	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public Date geteJoiningDate() {
		return eJoiningDate;
	}

	public void seteJoiningDate(Date eJoiningDate) {
		this.eJoiningDate = eJoiningDate;
	}

	public Date geteBirtDate() {
		return eBirtDate;
	}

	public void seteBirtDate(Date eBirtDate) {
		this.eBirtDate = eBirtDate;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
