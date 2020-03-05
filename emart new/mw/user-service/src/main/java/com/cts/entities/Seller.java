package com.cts.entities;

public class Seller extends User {
	private int sellerId;
	private String firstName;
	private String lastName;
	private String companyName;
	private String companyDescription;
	private Address address;
	private String website;
	private String email;
	private String phone;

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Seller(int userId, String userName, String password, Role role, String jwtToken, int sellerId,
			String firstName, String lastName, String companyName, String companyDescription, Address address,
			String website, String email, String phone) {
		super(userId, userName, password, role, jwtToken);
		this.sellerId = sellerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.companyDescription = companyDescription;
		this.address = address;
		this.website = website;
		this.email = email;
		this.phone = phone;
	}

	public Seller(int userId, String userName, String password, Role role, String jwtToken) {
		super(userId, userName, password, role, jwtToken);
	}

}
