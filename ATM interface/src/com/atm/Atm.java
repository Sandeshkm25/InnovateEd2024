package com.atm;

public class Atm implements AtmInterface{

	Database data=new Database();
	@Override
	public void transaction() {
		// TODO Auto-generated method stub
		data.transaction();
	}

	@Override
	public void deposit(double amt) {
		
		data.deposit(amt);
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		data.withdraw(amt);
	}

	@Override
	public void transfer(long accountNo, double amt) {
		data.tranfer(accountNo,amt);
		
	}

	@Override
	public void add(Customer c) {
		// TODO Auto-generated method stub
		data.add(c);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		data.remove(id);
	}
	
}
