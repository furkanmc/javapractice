package day11loops;

import java.util.Scanner;

public class DoWhileLoop02 {
/*
 
 
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Enter an integer");
			n = scan.nextInt();
			if(n<100) {
				System.out.println("Won!");
			}
		}while (n<100);
		System.err.println("Lost!");

		scan.close();
	}

}
