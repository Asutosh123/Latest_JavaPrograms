package com.testjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
        
        System.out.println(numbersList);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
               
        System.out.println(hashSet);
		
		
		
	}

}
