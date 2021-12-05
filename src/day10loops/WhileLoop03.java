package day10loops;

import java.util.Scanner;

public class WhileLoop03 {
/*
 
 
 
 
 
 */
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find sum of the digits...");
		int num = scan.nextInt();	//starting value
		int sum = 0;
		while(num!=0) {				//condition
			sum = sum + num%10;
			num = num/10;			//decrement
		}System.out.println(sum);
	scan.close();	
	}

}
