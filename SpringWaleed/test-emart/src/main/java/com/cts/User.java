package com.cts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
	@ApiModelProperty(value = "ID for a User")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer userId;
	
	@ApiModelProperty(value = "FirstName for a User")
	String firstName;
	
	@ApiModelProperty(value = "LastName for a User")
	String lastName;
	
	@ApiModelProperty(value = "e-mail for a User")
	String emailId;
	
	@ApiModelProperty(value = "mobile number for a User")
	String mobileNumber;
	
	@ApiModelProperty(value = "created date for a User")
	String createdDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
}
