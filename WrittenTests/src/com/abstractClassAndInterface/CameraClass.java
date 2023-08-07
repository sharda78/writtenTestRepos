package com.abstractClassAndInterface;
interface Camera
{
	int digitalphotograps = 2000;
	int polaroidphotograph = 10;
	int phonephotographs = 12600;
	String show();
}
class DigitalCamera implements Camera
{
	
	public String show()
	{
		System.out.println("A digitalcamera takes " + digitalphotograps + " photograps" );
		return "Taking a picture on my digital camera!";
	}
}
class PolaroidCamera implements Camera
{
	public String show()
	{
		System.out.println("\nA  polaroidcamera takes " + polaroidphotograph + " photograps" );
		return "Taking a picture on my polaroid camera!\n";
	}
}
class PhoneCamera implements Camera
{
	public String show()
	{
		System.out.println("\nA phonecamera takes " + phonephotographs + " photograps" );
		return " ";
	}
}
public class CameraClass {

	public static void main(String[] args) {
		PhoneCamera p = new PhoneCamera();
		System.out.println(p.show());
		
		PolaroidCamera p1 = new PolaroidCamera();
		System.out.println(p1.show());
		
		DigitalCamera d = new DigitalCamera();
		System.out.println(d.show());
		

	}

}
