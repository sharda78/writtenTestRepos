package com.Test_OOPS;

public class SnippetCode
{

	public static void main(String[] args) 
	{
		System.out.println(value());
	 }
	 static int value() 
	 {
		 //static int data = 0;      //Compilation error bcoz Only final is allow i.e
		 final int data = 0;
		 return data;
	 }

	}




/*

class Super {
public int index = 1;
}
class App extends Super {
public App(int index) {
 index = index;
}
public static void main(String args[]) {
 App myApp = new App(10);
 System.out.println(myApp.index);
}
}
 OUTPUT: 1
 
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
class Main {
 public static void PrintMain(Parent o)
 {
 o.Print();
 }
 public static void main(String[] args)
 {
 Parent x = new Parent();
 Parent y = new Child();
 Child z = new Child();
 PrintMain(x);
 PrintMain(y);
 PrintMain(z);
 }
}

OUTPUT : Compilation error we cannot convert child to parent

*/






/*

public class Code {
 public static void main(String[] args) {
 method(null);
 }
 public static void method(Object o) {
 System.out.println("Object method");
 }
 public static void method(Integer i) {
 System.out.println("Integer method");
 }
 public static void method(String s) {
 System.out.println("String method");
 }
 }
 
 OUTPUT: Ambiguity occur

*/