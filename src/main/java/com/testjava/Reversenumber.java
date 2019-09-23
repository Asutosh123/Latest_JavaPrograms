package com.testjava;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 452; 
        int reverse = 0;
             
        while(num!=0)
        {
        	reverse= (reverse*10)+(num%10);
        	          //0*10 + 452%10 = 2
        	num = num/10;
        	  // 452/10= 45.2
        }
        System.out.println(reverse);
		
	}

}
