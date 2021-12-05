package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
		//Create a String array and print the elements in alphabetical order on  the console in different lines
//		String sArr[] = new String[5];
//		System.out.println(Arrays.toString(sArr));//[null, null, null, null, null]		
//		sArr[0] = "Ali";
//		sArr[1] = "Bekir";
//		sArr[2] = "Zehra";
//		sArr[3] = "Yasin";
//		sArr[4] = "Mary";
		
		//How to create an Array by using shorter way
		String sArr[] = {"Ali", "Bekir", "Zehra", "Yasin", "Mary"};
		
		System.out.println(Arrays.toString(sArr));//[Ali, Bekir, Zehra, Yasin, Mary]
		
		//How to sort array elements
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));//[Ali, Bekir, Mary, Yasin, Zehra]
		
		//How to print array elements one by one

		
		//How to print array elements in reverse alphabetical order ==> //[ Zehra, Yasin, Mary, Bekir, Ali ]
		String sArrNew[] = new String[sArr.length];//create new blank array	
		System.out.println(Arrays.toString(sArrNew));
			for(int i1=0; i1<sArr.length; i1++) {
				sArrNew[i1] = sArr[sArr.length-1-i1];
		}
		System.out.println(Arrays.toString(sArrNew));
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter number of length");
//		int length=scan.nextInt();
//		String arr[] = new String[length];
//		for(int i=0;i<length;i++) {
//			System.out.println("Enter a String");
//			arr[i] = scan.next();	
//		}
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		String temp[] = new String[length];
//		for(int i=0;i<length;i++) {
//			temp[i]=arr[length-1-i];
//		}System.out.println(Arrays.toString(temp));

	}
}