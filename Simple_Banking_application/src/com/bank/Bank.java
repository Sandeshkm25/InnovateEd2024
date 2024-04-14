package com.bank;

public class Bank implements BankInterface{
 
	Account c;
	Bank()
	{
		
	}
	public Bank(Account a) {
		// TODO Auto-generated constructor stub
		c=a;
	}
	@Override
	public void deposit(double amt) {

		c.setAmount(c.getAmount()+amt);
		System.out.println("Amount added Successfully");
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(c.getAmount()>=amt)
		{
			c.setAmount(c.getAmount()-amt);
			System.out.println("Amount withdraw successfully");
		}
		else
			System.out.println("withdraw failed");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("balance amount ->"+c.getAmount());
	}

}
