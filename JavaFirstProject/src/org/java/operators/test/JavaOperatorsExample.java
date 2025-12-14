package org.java.operators.test;

public class JavaOperatorsExample {


	public static void main(String[] args) {
				// TODO Auto-generated method stub
		 System.out.println("--------------------1. Unary Operator --------------------");
		 int U1 =10;
		 
		 System.out.println("Postincrement : " + (U1++));
		 System.out.println("Postdecrement : " + (U1--));
		 
		 int U2 =20;
		 System.out.println("Postincrement : " + (U2++));
		 System.out.println("Postdecrement : " + (U2--));
		 
		 System.out.println("--------------------2. Arithmetic Operator --------------------");
		 System.out.println("-------------------- +,-, *, /, % --------------------");
		 int a = 10;
		 int b = 2;
		 
		 // Addition
		 int sum = a + b;
		 
		 // Subtraction
		 int diff = a - b;
		 
		 // Multiplication
		 int mul = a * b;
		 
		 // Division
		 int div = a / b;
		 
		 // Modulus
		 int mod = a % b;      // Modulus

		 System.out.println("Sum: " + sum);
		 System.out.println("Difference: " + diff);
		 System.out.println("Multiplication: " + mul);
		 System.out.println("Division: " + div);
		 System.out.println("Modulus: " + mod);
		 
		 
		 System.out.println("--------------------3. Relational Operator --------------------");
		 System.out.println("-------------------- > ,< , >= , <= , == , != --------------------");
		 // Comparison operators
		 int aa = 10;
		 int bb = 3;
		 int cc = 10;

		 System.out.println("aa > bb: " + (aa > bb));
		 System.out.println("aa < bb: " + (aa < bb));
		 System.out.println("aa >= bb: " + (aa >= bb));
		 System.out.println("aa <= bb: " + (aa <= bb));
		 System.out.println("aa == cc: " + (aa == cc));
		 System.out.println("aa != cc: " + (aa != cc));
		 
		 System.out.println("--------------------4. Logical Operator --------------------");
		 System.out.println("-------------------- && , || , ! --------------------");
		 
		//Logical operators
		 boolean x = true;
		 boolean y = false;

		 System.out.println("x && y: " + (x && y));
		 System.out.println("x || y: " + (x || y));
		 System.out.println("!x: " + (!x));
		 
		 System.out.println("--------------------5. Assignment Operators --------------------");
		 System.out.println("-------------------- = , += , -= , *= , /= , %= --------------------");
		 int n = 10;
		 
		 // n = n + 5
		 n += 5;  
		 System.out.println("After += : " + n);

		 
		 // n = n - 5
		 n -= 5;
		 System.out.println("After -= : " + n);
		 
		 // n = n * 2
		 n *= 2;  
		 System.out.println("After *= : " + n);
		 
		 // n = n / 2
		 n /= 2;  
		 System.out.println("After /= : " + n);
		 
		 // n = n % 3
		 n %= 3;
		 System.out.println("After %= : " + n);
			}

		


	

}
