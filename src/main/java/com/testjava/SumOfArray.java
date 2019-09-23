package com.testjava;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10, 20, 30, 40, 50, 20};
	      int sum = 0;
	      //Advanced for loop
	      for( int num : a) {
	          sum = sum+num;
	      }
	      
	      System.out.println("Sum of array elements is:"+sum);	
		
		
		
	}

}
