package com.testjava;

public class Swapwithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x = 10, y = 5; 
		  
		    // Code to swap 'x' and 'y' 
		    x = x + y; // x now becomes 15 
		    y = x - y; // y becomes 10 
		    x = x - y; // x becomes 5 
		    //cout << "After Swapping: x =" << x << ", y=" << y; 
		
		System.out.println("After Swapping x is" + x +"\n" + "After Swapping y is"+ y);
	}

}
