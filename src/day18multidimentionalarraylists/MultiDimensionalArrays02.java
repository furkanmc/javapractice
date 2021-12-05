package day18multidimentionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
/*
 1. way: convert 2 dimensional array then sort the elements in ascending order ang get the last element
 2. way: we will get the lowest value then if a value is greater than lowest value i will assign the value to lowest one
 */
	public static void main(String[] args) {
		int a[][]= {{11, 12}, {-5, 34}, {65,22, 31}};	
		//1. way
		int sum=0;
		for(int[] w : a) {
			sum = sum + w.length;
		}//System.out.println(sum);
		int b[] = new int[sum];
		int idx=0;
		for(int[] w:a) {
			for(int k:w) {
				b[idx]=k;
				idx++;	
			} 
		}System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println("Maximum element is " + b[sum-1]);
		
		//2. Way
		int x = Integer.MIN_VALUE;
		for(int[] w : a) {
			for(int y : w) {
				if(x < y) {
				x = y;
			}
				
		}
		
	}System.out.println("Maximum element is " + x);
	//Homework: type to code to find the minimum value in a 2 dimensional array
	int z = Integer.MAX_VALUE;
	for(int[] w : a) {
		for(int y : w) {
			if(z > y) {
			z = y;
		}
			
	}
	
}
	System.out.println("Minimum element is " + z);
	}

}