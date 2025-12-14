package org.java.program.test1;

public class ArrayExample {
	
	public static void main(String[] args) 
	{
	//1. Create an Array
		int[] a;       // declaration
		a = new int[3]; // memory allocation and hold 3 integers
		
		//Assign values one by one
			a[0]=1; 
			a[1]=2; 
			a[2]=3; 
	
	//2. Create an Array
		int[] numbers = new int[5];   // memory allocation and array that can hold 5 integers
	
		//Assign values one by one
			numbers[0]=1;	
			numbers[1]=2;
			numbers[2]=3;
			numbers[3]=4;
			numbers[4]=5;
	
	//3.Create an Array
			int[] arr = {10, 20, 30, 40, 50}; //Initialize directly (declaration + initialization)
			System.out.println(arr[0]); 
	
	}
}
