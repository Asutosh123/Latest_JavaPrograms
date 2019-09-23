package com.testjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

	  public static void main(String[] args) {

	        List<String> wishlist = new ArrayList<>();
	        wishlist.add("Bose Bluetooth HeadSet");
	        wishlist.add("Kindle Fire HD10");
	        wishlist.add("Good HDMI Cable");
	        wishlist.add("128GB Micro SD Card");
	        wishlist.add("Good Blueray Player");

	        // Iterating in forward direction
	        Iterator<String> itr = wishlist.iterator();
	        StringBuilder sb = new StringBuilder();
	        while (itr.hasNext()) {
	            sb.append(itr.next()).append(",");
	        }
	        System.out.println("forward order list: " + sb.toString());

	        // Iterating in reverse direction
	        // getting ListIterator from last Index
	        ListIterator<String> listItr = wishlist.listIterator(wishlist.size());
	        sb = new StringBuilder();
	        while (listItr.hasPrevious()) {
	            sb.append(listItr.previous()).append(" ");
	        }
	        System.out.println("reverse order list: " + sb.toString());
	    }

	}
	
	
	

