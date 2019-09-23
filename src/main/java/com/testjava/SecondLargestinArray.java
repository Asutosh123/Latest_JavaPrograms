package com.testjava;

public class SecondLargestinArray {

	public static void main(String[] args) {
		
    int a[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
	int max = a[0];
	int secondLargest = a[0];
	
	System.out.println("The given array is:" );
	
	
	for (int i = 0; i < a.length; i++) {
	
	if (a[i] > max) {
		    
			secondLargest = max;
			max = a[i];
		} 	

	else if 
	 (a[i] > secondLargest && a[i] != max) 
	 {
		 secondLargest = a[i]; 
	  }
		
	 }
	System.out.println("\nSecond largest number is:" + secondLargest);

}
	
}
