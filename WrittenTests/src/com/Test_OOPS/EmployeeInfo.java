package com.Test_OOPS;
import java.util.*;
class Employee
{
	int emp_id;
	String emp_name;
	float basic_salary;
	float gross_salary, da,da1,hra,hra1;
	
	public void putdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		emp_id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		emp_name = sc.next();
		System.out.println("Enter Basic_Salary: ");
		basic_salary = sc.nextFloat();
		System.out.println("Enter Basic DA of Employee: ");
		da1 = sc.nextFloat();
		System.out.println("Enter Basic HRA of Employee: ");
		hra1 = sc.nextFloat();	
		sc.close();
		}
	public void display()
	{
		da = (da1 * basic_salary) / 100;
		hra = (hra1 * basic_salary) / 100;
		gross_salary = basic_salary + da + hra;
		System.out.println("Gross_Salary is: " + gross_salary);
		
	}
}
public class EmployeeInfo 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.putdata();
		e.display();

	}

}
