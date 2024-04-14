package com.atm;

public class Service {
      AtmInterface atmInterface;
      SecurityCheck check;
      public Service()
      {
    	  atmInterface=new Atm();
    	  check=new SecurityCheck();
      }
	public void add(Customer c) {
		
		atmInterface.add(c);
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		atmInterface.remove(id);
	}

	public void deposit(int amt) {
		// TODO Auto-generated method stub
		atmInterface.deposit(amt);
	}

	public void withdraw(int amt1) {
		// TODO Auto-generated method stub
		atmInterface.withdraw(amt1);
	}

	public void transfer(long accNo, int amt3) {
		// TODO Auto-generated method stub
		atmInterface.transfer(accNo, amt3);
	}

	public void transaction() {
		// TODO Auto-generated method stub
		atmInterface.transaction();
	}

	public boolean check(String name,int password)
	{
		return check.check(name, password);
	}
	public boolean passwordCheck(int password)
	{
		return check.passwordChck(password);
	}
}
