package com.example.hellores.users;

public class UsersRequest{
	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private String email;
	private String username;

	public UsersRequest(String website, String phone, String name, String email, String username) {
		this.website = website;
		this.phone = phone;
		this.name = name;
		this.email = email;
		this.username = username;
	}

	public UsersRequest() {
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
