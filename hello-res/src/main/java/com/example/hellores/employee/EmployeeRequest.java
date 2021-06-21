package com.example.hellores.employee;

public class EmployeeRequest{
	private String fname;
	private String lname;

	public EmployeeRequest(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public EmployeeRequest() {
	}

	public void setFname(String fname){
		this.fname = fname;
	}

	public String getFname(){
		return fname;
	}

	public void setLname(String lname){
		this.lname = lname;
	}

	public String getLname(){
		return lname;
	}
}
