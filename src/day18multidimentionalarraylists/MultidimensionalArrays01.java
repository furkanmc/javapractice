package day18multidimentionalarraylists;

import java.util.Arrays;

public class MultidimensionalArrays01 {
	//Convert 2 dimensional array to 1 dimensional array
	/* 
	 Logic:
	 		1) Create 1 dimensional array and transfer all elements from 2 dimensional array to 2 dimensional array
	 		2)To create 1 dimensional element you need the number of elements you will put in
	 		3)to get the number of element in two dimensional array, you need to add the length of the inner rays
	 
	 */
	public static void main(String[] args) {
		int arr[][] = {{1,2}, {3,4,5}, {6,7,8,9,10}};
		
		//Get the number of element from arr
		int sum = 0;
		for(int[] w : arr) {
			sum = sum + w.length;
		System.out.println(sum);}
		int brr[] = new int[sum];
		int idx = 0;
		for(int[] w:arr) {
			for(int x:w) {
				brr[idx] = x;
				idx++;
			}
		}
	System.out.println(Arrays.toString(brr));
	}

}
