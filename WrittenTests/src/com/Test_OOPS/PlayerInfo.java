package com.Test_OOPS;
interface Player
{
	public abstract void play(); 
}
class Message implements Player
{
	public void play()
	{
		 System.out.println("we can say playing game is Relaxation of mind");
	}
}
class Child implements Player
{
	public void play()
	{
		System.out.println("use of classes1");
	}
}
class Musician implements Player
{
	public void play()
	{
		System.out.println("use of classes2");
	}
}
class Actor implements Player
{
	public void play()
	{
		System.out.println("use of classes3");
	}
}
public class PlayerInfo {

	public static void main(String[] args) {
		Player p = new Message();
		p.play();
		
		p = new Child();
		p.play();
		
		p=new Musician();
		p.play();
		
		p = new Actor();
		p.play();

	}

}
