package com.atm;

import java.util.ArrayList;

public class Customer {

	private String userName;
	private int userId;
	private int password;
	private long accNo;
	private double amt;
	private ArrayList<String> msg;
	public Customer(int userId, int password,String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName=userName;
		msg=new ArrayList<>();
	}
	public Customer() {
		super();
		msg=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	
	public ArrayList<String> getMsg() {
		return msg;
	}
	public void setMsg(ArrayList<String> msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "userId=" + userId + "\nuserName=" + userName + "\npassword=" + password +"\nAccount Number="+accNo+"\namt="+amt;
	}
	
	
	
	
}
