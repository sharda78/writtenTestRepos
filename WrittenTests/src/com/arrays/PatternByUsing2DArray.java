package com.arrays;

public class PatternByUsing2DArray {

	public static void main(String[] args) {
		int [][]arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			for(int k=0; k < i ;k++)  
			{  
			System.out.print("1" + " ");
			}
		System.out.println(" ");
		}
	}

}
