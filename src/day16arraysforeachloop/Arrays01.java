package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
//Check if 2 arrays are same or not
	public static void main(String[] args) {
		int arr1[] = {5,12,32,11};
		int arr2[] = {5,12,32,11};  
		//1/ way: typed a code to check if the arrays are same or not
		int counter = 0; //a flag
		if(arr1.length!=arr2.length) {
			System.out.println("Arrays are not same.");			
		}else {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				counter++; 
				break;			
			}
		}
		if (counter==1) {
			System.out.println("Arrays are not same");
		}else {
			System.out.println("Arrays are same");
		}
	}
		//2. way:There is a bulild in method in arrays class to check arrays are same or not
		 boolean isSame = Arrays.equals(arr1, arr2);
		 if(isSame) {
			 System.out.println("Arrays are same"); 
		 } else {
			 System.out.println("Arrays are not same"); 
		 }
			
	}
}
