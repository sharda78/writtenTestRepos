package com.Test_OOPS;

import java.util.Scanner;

abstract class Account
{
	int bal;
	public int acno,with,dept;
	String ac_hname;
	String address;
	
	public abstract void withdraw();
	public abstract void deposit();
	
	Account(int acno,int bal)
	{
		this.acno = acno;
		this.bal = bal;
	}
	public void display()
	{
		System.out.println("Total Balance: " + bal);
	}
}
class SavingAccount extends Account
{
	SavingAccount()
	{
		super(2361-4532-6530,15000);
	}
	
	public void withdraw()
	{
		int withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many amount you want to withdraw ?");
		withdrawAmount = sc.nextInt();
	
		if(bal > 0)
		{
		with = bal - withdrawAmount;
		System.out.println("After Withdraw Your Balance is: " + with);
		}else {
			System.out.println("Your Balance is Low.");
		}
		
	
	}
	public void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many amount you want to deposit ?");
		dept = sc.nextInt();
		bal = with + dept;
		System.out.println("After Deposit Your Balance is: " + bal + "\nNow Your Total Balance is: " + bal);
		sc.close();
	}
}
public class AccountInfo 
{
	public static void main(String[] args) 
	{
		SavingAccount a = new SavingAccount();
		a.display();
		a.withdraw();
		a.deposit();

	}

}
