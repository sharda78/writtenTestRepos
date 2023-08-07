package com.Test_OOPS;
class Vehicle
{
	protected int regnNumber;
	protected int speed;
	protected String color;
	protected String ownerName;
	
	 Vehicle(int regnNumber, int speed, String color, String ownerName)
	{
		this.regnNumber = regnNumber;
		this.speed = speed;
		this.color = color;
		this.ownerName = ownerName;
	}
	public void showData()
	{
		System.out.println("This is a Vehicle Class");
	}
}
class Bus extends Vehicle
{
	private int routeNumber = 23;
	Bus()
	{
		super(4207508, 80, "Red", "John Doe");
	}
	@Override
	public void showData()
	{
		System.out.println("\nRegistration Number: " + regnNumber);
		System.out.println("Speed of Vehicle: " + speed);
		System.out.println("Color of Vehicle: " + color);
		System.out.println("Owner Name of Vehicle: " + ownerName);
		System.out.println("Route Number of Vehicle: " + routeNumber);
	}
	
}
class Car extends Vehicle
{
	private String manufacturerName = "John";
	Car()
	{
		super(4207508, 80, "Red", "John Doe");
	}
	@Override
	public void showData()
	{
		System.out.println("\nManufacturer Name of Car: " + manufacturerName);
	}
	
}
public class VehicleInfo {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(4207508, 80, "Red", "John Doe");
		v.showData();
		
		v = new Bus();
		v.showData();
		
		v = new Car();
		v.showData();

	}

}
