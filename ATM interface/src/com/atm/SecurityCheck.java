package com.atm;

public class SecurityCheck {
   Database database=new Database();
	public boolean check(String name,int password)
	{
		return database.contains(name, password);
	}
	public boolean passwordChck(int password)
	{
		return database.passwordCheck(password);
	}
}
