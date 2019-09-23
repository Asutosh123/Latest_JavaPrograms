package com.testjava;

public class BigNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,5,9,43,6,7};
		
		int max = a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Maximum number is"+max);
	}

}
