package com.testjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);  
		
		
		
	}

}
