package com.Test_OOPS;

class Time
{
	private int hour,min,sec;
	Time(int hour,int min,int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public Object add()  // Time t
	{
		
		System.out.println("hours: " + hour + "\nmin: " + min + "\nsec: " + sec);
	return 5;
	}
}
public class TimeInfo {

	public static void main(String[] args) 
	{
	Time t = new Time(4,32,59);
	t.add();
	System.out.println("-----------------------------");
	
	//Time t1 = new Time(7,45,04);
	//t1.add(new Time(7,45,04));
	}

}
