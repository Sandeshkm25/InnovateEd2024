package com.atm;

public interface AtmInterface {

	void transaction();
	void deposit(double amt);
	void withdraw(double amt);
	void transfer(long accountNo, double amt);
	void add(Customer c);
	void remove(int id);
}
