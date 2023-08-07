package com.Test_OOPS;

import java.util.Scanner;

abstract class MotorVehicle
{
	String modelName;
	int modelNumber;
	 int modelPrice,paid;
	
	MotorVehicle(String modelName,int modelNumber, int modelPrice)
	{
		this.modelName = modelName;
		this.modelNumber = modelNumber;
		this.modelPrice = modelPrice;
	}
}
class Carthat extends MotorVehicle
{
	int discount,discountrate;
	Carthat()
	{
		super("BMW" , 20,150000);
	}
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Discount");
		discount = sc.nextInt();
		if(discount == 5)
		{
			discountrate = (modelPrice * 5)/100;
			paid = modelPrice - discountrate;
		}
		else if(discount == 10)
		{
			discountrate = (modelPrice * 10)/100;
			paid = modelPrice - discountrate;
		}
		else if(discount == 15)
		{
			discountrate = (modelPrice * 15)/100;
			paid = modelPrice - discountrate;
		}
		else if(discount == 20)
		{
			discountrate = (modelPrice * 20)/100;
			paid = modelPrice - discountrate;
		}else {
			System.out.println("Enter valid credentials");
		}
		System.out.println("Model Name is: " + modelName);
		System.out.println("Model Number is: " + modelNumber);
		System.out.println("Model Price is: " + modelPrice);
		System.out.println("You have to paid RS: " + paid);
		sc.close();
	}
}
public class MotorVehicleInfo 
{
	public static void main(String[] args) 
	{
		Carthat c = new Carthat();
		c.display();

	}

}
