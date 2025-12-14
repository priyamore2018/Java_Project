package org.java.assigenment.test.priyanka;

public class ArrayMinMaxProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {9,3,5,45,6,10,99};
		

		int max=a[0];
		
		for (int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];	
			}
		
		}
		System.out.println(max);
		
		
		int min=a[0];
		
		for (int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];	
			}
		
		}
		System.out.println(min);
	
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("************* Min value *****************");
		int [] b= {3,5,2,6,45,78};
		int value=0;
	
		//System.out.println(b.length);
		for(int j=0;j<=b.length-1;j++)
		{
			int minNum=b[0];
		
			
			for(int firstIndex:b)
			{
				if(firstIndex<minNum)
				{
					value=firstIndex;
				}
			}
			
		}
		System.out.println(value);
	
		
	}
	

}
