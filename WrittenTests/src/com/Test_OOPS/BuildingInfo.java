package com.Test_OOPS;

class Building 
{
	int noOfFloor;
	int noOfRoom;
	int total ;
	
	public void get(int noOfFloor,int noOfRoom)
	{
		this.noOfFloor = noOfFloor;
		this.noOfRoom = noOfRoom;
		
	}
	public void display()
	{
		System.out.println("Number of Floors in Building: " +noOfFloor);
		System.out.println("Number of Rooms in Building: " + noOfRoom);
		System.out.println("Total Footage: " +  noOfFloor * noOfRoom);
	}
}
class House extends Building
{
	int noOfBedrooms;
	int noOfBathrooms;
	
	public void get(int noOfBedrooms,int noOfBathrooms)
	{
		this.noOfBathrooms = noOfBedrooms;
		this.noOfBedrooms = noOfBathrooms;
	}
	@Override
	public void display()
	{
		System.out.println("Number of Bed Rooms: " +noOfBedrooms);
		System.out.println("Number of Bath Rooms: " + noOfBathrooms);
	}
}
class Office extends Building
{
	int noOfTelephone;
	int tables;
	public void get(int noOfTelephone,int tables)
	{
		this.noOfTelephone = noOfTelephone;
		this.tables = tables;
	}
	@Override
	public void display()
	{
		System.out.println("Number of Telephone: " + noOfTelephone);
		System.out.println("Number of Tables: " + tables);
	}
}
public class BuildingInfo 
{
	
	public static void main(String[] args) 
	{
		Building b = new Building();
		b.get(4, 24);
		b.display();
		
		b = new House();
		b.get(10,15);
		b.display();
		
		b = new Office();
		b.get(5, 30);
		b.display();
		

	}

}
