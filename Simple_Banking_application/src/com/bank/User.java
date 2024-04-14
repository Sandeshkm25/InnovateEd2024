package com.bank;

public class User {

	public static void main(String[] args) {
		Account a=new Account("sandesh", 5678, 1234," issuru", 0);
		Service s=new Service(a);
		s.deposit(1000);
		s.withdraw(100);
		s.checkBalance();
		Account a1=new Account("sand", 5678, 12," issuru", 0);
		Service s1=new Service(a1);
		s1.deposit(1000);
		s1.withdraw(400);
		s1.checkBalance();
	}
}
