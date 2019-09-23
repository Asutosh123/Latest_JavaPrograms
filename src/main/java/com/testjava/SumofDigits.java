package com.testjava;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		
		  int Number, Remainder, sum = 0;
	        Scanner scn = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        Number = scn.nextInt();
	        while(Number > 0)
	        {
	            Remainder = Number % 10;
	            sum = sum + Remainder;
	            Number = Number / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
	}

}
