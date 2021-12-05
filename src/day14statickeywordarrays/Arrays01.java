package day14statickeywordarrays;

import java.util.Arrays;

public class Arrays01 {
/*
 	1) Arrays are for storing multiple data in a single container
 	2) An array can accept just a single data type
 	3) Arrays can accept just "Primitives" and "references" as element. not accept "non-primitives" theoritically
 	4) Arrays are non-primitives
 	5) When you create the arrey you must be declare the maximum number of elements(capacity)
 
 
 
 */
	public static void main(String[] args) {
		//How to create an Array
		int arr1[] = new int[5];//Integer arr1[] = new Integer[5];
		//How to print an Array on the console
		System.out.println(Arrays.toString(arr1));//[0,0,0,0,0]
		//How to add elements into an array
		arr1[1] = 11;
		System.out.println(Arrays.toString(arr1));//[0,11,0,0,0]
		arr1[0] = 23;
		arr1[1] = 11;
		arr1[2] = 32;
		arr1[3] = 12;
		arr1[4] = 25;
		System.out.println(Arrays.toString(arr1));
	
	
	}

}
