package com.example.hellores.employee;

import java.util.Objects;

public class EmployeeResponse{
	private String fname;
	private String lname;
	private int id;

	public EmployeeResponse() {
	}

	@Override
	public String toString() {
		return "EmployeeRes"+getFname()+","+getLname()+","+getId();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EmployeeResponse that = (EmployeeResponse) o;
		return id == that.id && Objects.equals(fname, that.fname) && Objects.equals(lname, that.lname);
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
