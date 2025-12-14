package org.java.operators.test;

public class DataTypesExample {
	
		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println(" ------------------------- Primitive Data Type -------------------------  ");
		//1. int Data type
				int a=10;
				System.out.println("int: A 32-bit signed integer commonly used for whole numbers.");
				System.out.println("Int : " + a+"\n");
		//2. boolean		
				boolean tv_ON=false;
				System.out.println("Boolean : Represents one of two logical values: true or false. Commonly used for conditional checks.");
				System.out.println("Boolean : tv_ON = " + tv_ON +"\n");
				
		//3. char
				char letter='a';
				System.out.println("char : A 16-bit Unicode character used to store single symbols or letters.");
				System.out.println("char : "+letter+"\n");
				
		//4. short
				short result_cutOFF=12345;
				System.out.println("short : A 16-bit signed integer often used when memory is limited and values are moderate in size.");
				System.out.println("short : "+result_cutOFF+"\n");
		//5. byte
				
		/*byte is small: only 8 bits.
		It can store numbers from -128 to 127.
		It saves memory when you don’t need larger numbers.*/
				byte value=-127;
				System.out.println("Byte : byte is small: only 8 bits.\n"
						+ "It can store numbers from -128 to 127.\n"
						+ "It saves memory when you don’t need larger numbers.");
				System.out.println("byte : value= "+value+"\n");
				
		//6. long 
				
				long worldPopulation= 999332492349l;
				System.out.println("long : A 64-bit signed integer used when int is not sufficient for large values");
				System.out.println("long : "+worldPopulation+"\n");

		//7. float
				
				float sumTwoNumbers= 100;
				System.out.println("float : A 32-bit single-precision floating-point type used for fractional values.");
				System.out.println("float : "+sumTwoNumbers+"\n");
		//8. double
				double bankbranch_balance = 9999123498394.9912132343d;
				System.out.println("double : A 64-bit double-precision floating-point type and the default for decimal numbers.");
				System.out.println("double : "+bankbranch_balance+"\n");

				
				System.out.println(" ------------------------- Non- Primitive Data Type ------------------------- ");
				System.out.println("string");
				
			}

		


	

}
