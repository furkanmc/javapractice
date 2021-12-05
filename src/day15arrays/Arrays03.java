package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		// [0, 2, 3, 0, 12, 0] put the zeros to the end
		
		int arr[] = {0, 2, 0, 3,13,1,-10};
		
		int brr[] = new int[arr.length];
		
		int idx = 0;

//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			brr[i] = arr[arr.length-1-i];
//		}		
		for(int i =0; i<arr.length; i++) {

			if(arr[i]!=0) {
				
				brr[idx] = arr[i];
				
				idx++;
			}
			
		}
				
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));

	}

}