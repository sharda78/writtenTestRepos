package com.abstractClassAndInterface;

import java.util.Scanner;

interface Exam
{
	public void cal_Percentage();
}
class Student
{
	String name;
	int rollno;
	int marks;
	public void show()
	{
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt(); 
	}
}
class Result extends Student implements Exam
{
	int per;
	public void cal_Percentage()
	{
		per = marks / 5;
		
		
	}
	public void display()
	{
		System.out.println("percentage: " + per);
	}
}
public class StudentA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r = new Result();
		r.show();
		r.cal_Percentage();
		r.display();
	}

}
