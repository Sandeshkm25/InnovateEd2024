package com.atm;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Service service= new Service();
		System.out.println("^^^^^Welcome to the ATM^^^^^");
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("press 1 for Add the customer "
					+ "\npress 2 for remove the customer "
					+ "\npress 3 for login"
					+ "\npress 4 for quit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter your name");
				String name=sc.next();
				System.out.println("set your password");
				int password=sc.nextInt();
				System.out.println("Enter your Account number");
				long acc=sc.nextLong();
				Customer c=new Customer();

				c.setUserName(name);
				c.setAccNo(acc);
				c.setPassword(password);

				service.add(c);
				break;
			case 2:
				System.out.println("set your password");
				int id=sc.nextInt();
				service.remove(id);
				break;
			case 3:
				System.out.println("Enter your name");
				String name1=sc.next();
				System.out.println("set your password");
				int password1=sc.nextInt();
				if(service.check(name1,password1))
				{
					System.out.println("***************************");
					boolean condition=true;
					while(condition)
					{
						System.out.println("press 1 for deposit"
								+ "\npress 2 for withdraw "
								+ "\npress 3 for tranfser"
								+ "\npress 4 for Transaction History"
								+ "\npress 5 for back"
								+ "\npress 6 for quit");
						System.out.println("Enter your choice");
						int choice2=sc.nextInt();
						switch(choice2)
						{
						case 1:
							System.out.println("enter your amt");
							int amt=sc.nextInt();
							System.out.println("enter password");
							int password2=sc.nextInt();
							if(service.passwordCheck(password2))
							{
								service.deposit(amt);
							
							}
							break;
						case 2:
							System.out.println("enter your amt");
							int amt1=sc.nextInt();
							System.out.println("enter password");
							int password4=sc.nextInt();
							if(service.passwordCheck(password4))
							{
								service.withdraw(amt1);
							}
							
							break;
						case 3:
							System.out.println("enter your amt");
							int amt3=sc.nextInt();
							System.out.println("Enter your Account number");
							long accNo=sc.nextLong();
							System.out.println("enter password");
							int password5=sc.nextInt();
							if(service.passwordCheck(password5))
							{
								service.transfer(accNo,amt3);
							}
							
							
							break;
						case 4:
							service.transaction();
							break;
						case 5:
							condition=false;
							break;
						case 6:
							System.out.println("thank you");
							System.exit(1);
							default:
								System.out.println("enter valid number");
						}
						System.out.println("------------------------------");
					}
				}
				break;
			case 4:
				System.out.println("thank you");
				System.exit(1);
			case 5:
				new Database().showAll();
				break;
				default:System.out.println("enter valid number");
					
			}
			System.out.println("///////////////////////////////////////////////");
		}
	}
}
