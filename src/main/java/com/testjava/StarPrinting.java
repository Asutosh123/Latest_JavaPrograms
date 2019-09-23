package com.testjava;

public class StarPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i>=0;i--)
		  {
		   for(int k=3-i;k>=1;k--)
		     {
		    System.out.print(" ");
		     }
		  
		  for(int j=1;j<=i;j++)
		  {
		   System.out.print("*");
		   
		  }
		  System.out.println();
		 
		 
	}

}
}