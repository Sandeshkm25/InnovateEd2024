package com.reverse;

import java.util.Scanner;

public class ReverseString {
 public static void reverse(String s)
 {
	 char a[]=new char[s.length()];
	 int b=s.length()-1;
	 for(int i=0;i<s.length();i++)
	 {
		 a[b]=s.charAt(i);
		 b--;
	 }
	 String s1="";
	 for(int i=0;i<a.length;i++)
	 {
		 s1+=a[i];
	 }
	 System.out.println(s1);
 }
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the String");
	String s =sc.nextLine();
	reverse(s);
}
}
