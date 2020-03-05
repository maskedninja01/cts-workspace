package com.cts.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buyer extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int buyerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private Address address;
	private LocalDate createdDate;

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Buyer(int userId, String userName, String password, Role role, String jwtToken, int buyerId,
			String firstName, String lastName, String emailId, String mobileNumber, Address address,
			LocalDate createdDate) {
		super(userId, userName, password, role, jwtToken);
		this.buyerId = buyerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.createdDate = createdDate;
	}

	public Buyer(int userId, String userName, String password, Role role, String jwtToken) {
		super(userId, userName, password, role, jwtToken);
	}

}
