package day04concatenationifstatement;

import java.util.Scanner;

public class P77Q03 {

	public static void main(String[] args) {
/*
 Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D 2. 50 to 59 - C 3. 60 to 80 - B. 4. From 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your mark...");

		int grd = scan.nextInt();
		
		
		if(grd<50 ) {
			System.out.println( grd + " - D" );
		}
		else if(grd>=50 && grd<60 ) {
			System.out.println(grd + " - C" );
		}
		else if(grd>=60 && grd<80 ) {
			System.out.println(grd + " - B" );
		}
		else if(grd>=80 && grd<100  ) {
			System.out.println(grd + " - A" );
		}
		else {
			System.out.println("Enter a number between 0 and 100");
		}

}}
