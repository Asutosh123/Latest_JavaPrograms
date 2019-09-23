package com.testjava;

public class DuplicateRemoveString {
		 
		    public static void main(String[] args) {
		        String s = "navaneethtt";
		        int count = 0;
		        char[] ch = s.toCharArray();

		        for (int i = 0; i < s.length(); i++) {
		        	
		            for (int j = i + 1; j < s.length(); j++) {
		            	
		                if (ch[i] == ch[j]) {
		                    System.out.println(ch[j]);
		                    count++;
		                    break;
		                }
		            }
		        }

		 
		
		
		
		
		
		
		
		
	}

}
