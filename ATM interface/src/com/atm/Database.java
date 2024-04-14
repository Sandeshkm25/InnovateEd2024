package com.atm;

import java.util.ArrayList;

public class Database {

	int id=0;
	 static ArrayList<Customer> a=new ArrayList<Customer>();
	 static Customer c1;
	public void add(Customer c)
	{
		id++;
		c.setUserId(id);
		a.add(c);
		System.out.println(c);
	}
	public void remove(int id)
	{
		a.remove(id-1);
		System.out.println("removed");
	}
	public void showAll()
	{
		for(Customer c:a)
		{
			System.out.println(c);
		}
	}
	public Customer showById(int id)
	{
		return a.get(id-1);
	}
	
	public  boolean contains(String name,int password)
	{
		for(Customer c2:a)
		{
			if(c2.getUserName().equals(name)) {
				System.out.println("username matches");
				if(c2.getPassword()==password)
				{
					System.out.println("password matches");
					c1=c2;
					
					return true;
				}
				
			}
			
		}
		System.out.println(c1);
		System.out.println("username cannot found");
		return false;
	}
	public void deposit(double amt)
	{
		c1.setAmt(c1.getAmt()+amt);
		ArrayList<String> msg=c1.getMsg();
		msg.add("amount deposited "+ amt);
		c1.setMsg(msg);
		a.set(c1.getUserId()-1, c1);
		System.out.println("Amount deposited");
		return;
	}
	public void transaction() {
		// TODO Auto-generated method stub
		ArrayList<String> msg=c1.getMsg();
		for(String s:msg)
		{
			System.out.println(s);
		}
	}
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(c1.getAmt()>=amt)
		{
			c1.setAmt(c1.getAmt()-amt);
			ArrayList<String> msg=c1.getMsg();
			msg.add("amount withdraw "+ amt);
			c1.setMsg(msg);
			a.set(c1.getUserId()-1, c1);
			System.out.println("Amount withdraw");
			
		}
		else {
			System.out.println("withdraw failed");
		}
		return ;
	}
	public void tranfer(long accountNo, double amt) {
		for(Customer cust:a)
		{
			if(cust.getAccNo()==accountNo)
			{
				cust.setAmt(cust.getAmt()+amt);
				
				c1.setAmt(c1.getAmt()-amt);
				
				ArrayList<String> msg=c1.getMsg();
				msg.add("amount transfered "+ amt);
				c1.setMsg(msg);
				ArrayList<String> msg1=cust.getMsg();
				msg1.add("amount transfered "+ amt);
				cust.setMsg(msg1);
				a.set(cust.getUserId()-1, cust);
				a.set(c1.getUserId()-1, c1);
				System.out.println("Amount transfered successfully");
				return ;
			}
		}
		System.out.println("Account number Not Matched");
		return ;
	}
	
	public boolean passwordCheck(int password)
	{
		if(c1.getPassword()==password)
		{
			return true;
		}
		System.out.println("password cannot match");
		return false;
	}
}
