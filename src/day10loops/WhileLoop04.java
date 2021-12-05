package day10loops;

import java.util.Scanner;

public class WhileLoop04 {
/*
  
 
 
 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find sum of its factors...");
		int num =Math.abs(scan.nextInt());
		int i=1;
		int counter=0;//flag
		while(i<=num) {
			if(num%i==0) {
				counter++;//execution of if body
				System.out.print(i + " ");
			}
			
			i++;
		}scan.close();
		System.out.println("The number of positive factors:" + counter);
		System.out.println("The number of negative factors:" + counter);
		System.out.println("The number of all factors:" + 2*counter);
	}

}
