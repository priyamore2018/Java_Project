package org.java.assigenment.test.priyanka;
import java.util.Scanner;
public class ArryaMinProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        //Scanner scanner = new Scanner(System.in);

		        // Input array size
		        //System.out.print("Enter the number of elements in the array: ");
		        //int n = scanner.nextInt();

		        int[] arr = {6,7,1,9,0};
		        int n=0;

		        // Input array elements
		      System.out.println("Enter " + n + " integers:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i]=n;
		        }

		        // Initialize sum, max, and min
		        int sum = 0;
		        int max = arr[0];
		        int min = arr[0];

		        System.out.print("Even numbers in the array: ");
		        for (int num : arr) {
		       
		            // Find maximum
		            if (num > max) {
		                max = num;
		            }

		            // Find minimum
		            if (num < min) {
		                min = num;
		            }
		        }

		        System.out.println(); // For new line
		        System.out.println("Sum of all elements: " + sum);
		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);

		       // scanner.close();
		    }
		

	

}
