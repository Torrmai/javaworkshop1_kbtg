package com.example.hellores.employee;

public class EmployeeResponse{
	private String fname;
	private String lname;
	private int id;

	public EmployeeResponse() {
	}

	public EmployeeResponse(String fname, String lname, int id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}
}
