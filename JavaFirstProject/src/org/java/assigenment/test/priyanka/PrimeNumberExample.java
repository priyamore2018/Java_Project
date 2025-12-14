/*	Q.1) Write a Java program that checks whether a given number is prime or not.
Use appropriate conditional statements. */

package org.java.assigenment.test.priyanka;
public class PrimeNumberExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean primeNumValidate= true;
		int number = 23;
	
	for (int i = 2; i < number; i++) 
	{        
			if (number % i == 0) 
			{
				primeNumValidate = false;
		      break;         
		    }
	}
	
		if ( primeNumValidate && number > 1)
		{
		 System.out.println(number + " number is Prime number");
		}
	   else
	   {
		 System.out.println(number + " number is not Prime number"); 
	   }
	 }
}
