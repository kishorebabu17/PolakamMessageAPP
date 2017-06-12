package com.polakams.PolakamMessageAPP.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	

	String FName;
	String LName;
	String phone_number;
	String EmailID;
	
	

	public User() {
		super();
	}

	public User(String fName, String lName,String phoneNumber, String emailID) {
		super();
		FName = fName;
		LName = lName;
		phone_number = phoneNumber;
		EmailID = emailID;
	
	}

	@GeneratedValue
	@Id
	Long UserID;

	public Long getUserID() {
		return UserID;
	}

	public void setUserID(Long userID) {
		UserID = userID;
	}
	
	
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phoneNumber) {
		phone_number = phoneNumber;
	}

	public String getEmailID() {
		return EmailID;
	}

	public void setEmailID(String emailID) {
		EmailID = emailID;
	}

	@Override
	public String toString() {
		return "RegisterUser [FName=" + FName + ", LName=" + LName + ", PhoneNumber=" + phone_number + ", EmailID="
				+ EmailID + ", UserID=" + UserID + "]";
	}

	
	

}
