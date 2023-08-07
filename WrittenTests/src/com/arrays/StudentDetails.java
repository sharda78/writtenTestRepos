package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

/*
 
 6. Write Java Program to store 5 Student type objects in continuous memory blocks. 
Each Student will have roll, name, marks.   
                                                          
1.Sort these objects in ascending order of marks, write a method sortRecords in 
Student with Student type array as parameter.                                                              
2.Write showRecords Method in Student class to show all records by using for each loop. 

 */
class Student {
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {

		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	public  void showRecords() 
	{
		
		System.out.println("Roll no: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		
	}
	public static void showRecords(Student stu[])
	{
		int i,j;
		for( i = 0; i < stu.length; i++)
		{
			for( j = 0; j< stu.length-1; j++)
			{
				if(stu[j].marks > stu[j+1].marks)
				{
					Student temp = stu[j];
					stu[j] = stu[j+1];
					stu[j+1] = temp;	
				}
				
			}//inner
			
		}//outer
		
	
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	}


	public class StudentDetails {
		public static void main(String[] args) {

			Student s[] = new Student[5];
			s[0] = new Student(102, "John", 80);
			s[1] = new Student(103, "Ram", 90);
			s[2] = new Student(104, "Leena", 70);
			s[3] = new Student(105, "Raj", 50);
			s[4] = new Student(106, "Tina", 60);
	
			for (Student a : s) {
				System.out.println(a);
				System.out.println("---------------------------------------------");
				
				Student.showRecords(s);
				System.out.println("------Student Marks In Ascending------------");
				for(Student x : s)
				{
					System.out.println(x);
				}
			}

		}
	}

