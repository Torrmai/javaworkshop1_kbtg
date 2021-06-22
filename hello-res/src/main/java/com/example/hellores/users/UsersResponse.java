package com.example.hellores.users;

import java.util.Objects;

public class UsersResponse{
	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private int id;
	private String email;
	private String username;

	public UsersResponse(String website, String phone, String name, int id, String email, String username) {
		this.website = website;
		this.phone = phone;
		this.name = name;
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public UsersResponse() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UsersResponse that = (UsersResponse) o;
		return id == that.id && Objects.equals(website, that.website) && Objects.equals(address, that.address) && Objects.equals(phone, that.phone) && Objects.equals(name, that.name) && Objects.equals(company, that.company) && Objects.equals(email, that.email) && Objects.equals(username, that.username);
	}


	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	public Address getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCompany(Company company){
		this.company = company;
	}

	public Company getCompany(){
		return company;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}
}
