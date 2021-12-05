package day04concatenationifstatement;

import java.util.Scanner;

public class P77Q04 {

	public static void main(String[] args) {
/*
 Ask user to enter year
Type java code by using if-else if() statement.
Write a program to check if a year is leap year or not.
if the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year...");
		int year = scan.nextInt();
		if (year< 0) {
			System.out.println("Please enter a valid year");}
		else if (year%100 == 0 && year%400 == 0) {
			System.out.println(year + " is a leap year");
		}else if(year%100 != 0 && year%4 == 0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		scan.close();	
	}

}
