package com.testjava;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String s = "abc xyz";
		  String s1="";
		  String s2[] =  s.split(" ");
		  
		  for(int i=s.length()-1; i>=0; i--)
		  {
			  s1=  s1 +" "+s2[i];
		  }
		  System.out.println(s1);
	}

}
