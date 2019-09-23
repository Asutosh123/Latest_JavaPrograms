package com.testjava;

public class StringSplitReverse {

	public static void main(String[] args) {
		
		String s1="Jgate is Good";
		String s2[]=s1.split(" ");
		String s3= "";
		//System.out.println(s2[0]);
		for(int i=s2.length-1;i>=0;i--)
				{
			     s3 =s3+ " "+s2[i];
				}
		System.out.println(s3);

	}
}
