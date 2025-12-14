package org.java.assigenment.test.priyanka;

/*
 Q.2) Create a Java program that takes an array of integers and prints:
 	* All even numbers
 	* The sum of all elements
 	* The maximum and minimum value

 */
public class ArrayProgram {

	public static void main(String[] args) {
		
		int []a= {11,20,2,5,44,72,3,99,6}; //create an array (Declaration + initialization)
		
	
		//1. even numbers:
		
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println("Even Number :" + a[i]);
			}

		}
		
		System.out.println( "\n");
		//2. Sum of all elements
		int totalSum=0;
		
		for(int j=0;j<=a.length-1;j++)
		{
			totalSum=totalSum+a[j];
		}
		System.out.println("Sum of all elements :" + totalSum + "\n");
	
		
		// 3. The maximum and minimum value
	

		int max=a[0];
		
		for (int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];	
			}
		
		}
		System.out.println("The maximum value = "+max);
		
		
		int min=a[0];
		
		for (int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];	
			}
		
		}
		System.out.println("The minimum value = "+min);
	
	}

}
