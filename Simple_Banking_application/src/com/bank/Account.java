package com.bank;

public class Account {

	private String name;
	private long Accno;
	private long phoneNo;
	private String address;
	private double amount;
	public Account(String name, long accno, long phoneNo, String address, double amount) {
		super();
		this.name = name;
		Accno = accno;
		this.phoneNo = phoneNo;
		this.address = address;
		this.amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return Accno;
	}
	public void setAccno(long accno) {
		Accno = accno;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "name=" + name + "\nAccno=" + Accno + "\nphoneNo=" + phoneNo + "\naddress=" + address
				+ "\namount=" + amount + "]";
	}
	
	
}
