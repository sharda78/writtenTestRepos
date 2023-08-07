package com.abstractClassAndInterface;
abstract class Test
{
	Test()
	{
		System.out.println("This is constructor of abstract class");
	}
	public abstract void a_method();
	public void display()
	{
		System.out.println("This is normal method of abstract class");
	}
}
class Subclass extends Test
{
	public void a_method()
	{
		System.out.println("This is absttract method");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.a_method();
		s.display();

	}

}
