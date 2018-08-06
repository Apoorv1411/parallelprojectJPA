package com.cg.paytmwallet.bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class AccountApp1 {
	@Id
	private String mobileNo;
private String name;
private String email;
private double balance;



public AccountApp1() {
	super();
}


public AccountApp1(String name, String email, double balance, String mobileNo) {
	super();
	this.name = name;
	this.email = email;
	this.balance = balance;
	this.mobileNo = mobileNo;
}


public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email = email;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}



}
