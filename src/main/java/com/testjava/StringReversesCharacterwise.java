package com.testjava;

import java.util.Scanner;

public class StringReversesCharacterwise {

	public static void main(String[] args) {
		
		String s="java is easy";
		//Scanner scn = new Scanner(System.in);
		//scn.nextLine();
		String s2[]= s.split("");
		String s1 = "";
		
	
		for(int i=s2.length-1; i>=0;i--)
		{
			s1=s1 + s2[i]+ "";
		}

		System.out.print(s1);
	}

}

