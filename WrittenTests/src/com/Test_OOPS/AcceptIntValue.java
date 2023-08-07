package com.Test_OOPS;
import java.util.*;
class IntValue
{
	int val;
	public void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		val = sc.nextInt();
		sc.close();
		}
	public void PrintNumberInWord()
	{
		if(val == 1)
		{
			System.out.println("ONE");
		}else if (val == 2) {
			System.out.println("TWO");
		}
		else if (val == 3) {
			System.out.println("THREE");
		}
		else if (val == 4) {
			System.out.println("FOUR");
		}
		else if (val == 5) {
			System.out.println("FIVE");
		}
		else if (val == 6) {
			System.out.println("SIX");
		}
		else if (val == 7) {
			System.out.println("SEVEN");
		}
		else if (val == 8) {
			System.out.println("EIGHT");
		}
		else if (val == 9) {
			System.out.println("NINE");
		}
		else if (val == 0) {
			System.out.println("ZERO");
		}else {
			System.out.println("Invalid");
		}
	}
}
public class AcceptIntValue {

	public static void main(String[] args) {
		IntValue i = new IntValue();
		i.get();
		i.PrintNumberInWord();

	}

}
