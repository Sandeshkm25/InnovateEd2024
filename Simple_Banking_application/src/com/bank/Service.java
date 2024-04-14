package com.bank;

public class Service {
    BankInterface bankInterface;
    Service()
    {
    	
    }
	public Service(Account a) {
		bankInterface=new Bank(a);
	}
	public void deposit(double amt)
	{
		bankInterface.deposit(amt);
	}
	public void withdraw(double amt)
	{
		bankInterface.withdraw(amt);
	}
	public void checkBalance()
	{
		bankInterface.checkBalance();
	}
}
