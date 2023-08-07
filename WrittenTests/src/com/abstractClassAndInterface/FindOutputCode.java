package com.abstractClassAndInterface;

/*
interface X
{ void methodX(); }
class Y implements X
{
 void methodX()
 {
 System.out.println("Method X");
 }
}
//OUTPUT : Compilation Error......in interface,method is implicitely public soo we have to declear 'public' in class y
*/


/*
 interface P
 
{
 String p = "PPPP";
 String methodP();
}
interface Q extends P
{
 String q = "QQQQ";
 String methodQ();
}
class R implements P, Q
{
 public String methodP() {return q+p; }
 public String methodQ() {return p+q; }
}
public class FindOutputCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r = new R();
		System.out.println(r.methodP());
		 System.out.println(r.methodQ());

	}

}
//OUTPUT: QQQQPPPP
 //       PPPPQQQQ
*/
 

/*
class Parent {
	 public void Print()
	 {
	 System.out.println("Parent");
	 }
	}
	class Child extends Parent {
	 public void Print()
	 {
	 System.out.println("Child");
	 }
	}
	
public class FindOutputCode {
	public static void PrintMain(Parent o)
	 {
	 o.Print();
	 }

	public static void main(String[] args) {
		Parent x = new Parent();
		 Parent y = new Child();
		 Child z = new Child();
		 PrintMain(x);
		 PrintMain(y);
		 PrintMain(z);	
	}

}
//OUTPUT
// Parent
//Child
//Child

*/

public class FindOutputCode {
	public static void main(String[] args) {
	
		
	}
}
	


