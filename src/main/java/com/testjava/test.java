package com.testjava;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "URL : http://172.25.10.98:81/report/displayReport?reportKey=522e5f95a3b8a0eb9b6488628896370634b99226ff3fdad83d9a4ca28c2d2fe5";
		
		    String s1 = s.replace("URL : ","");
		                //s.trim(URL,"");
		    System.out.println(s1);
		   
	}

}
