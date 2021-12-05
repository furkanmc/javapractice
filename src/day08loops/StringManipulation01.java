package day08loops;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		/*
		     Ask user to enter SSN (9 digits)
		     Print the SSN on the console after converting first 5 digits to *
		     Ex: 123456789 ==> *****6789
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your social security numbe...");
		String ssn = scan.next();
		String lastFourDigits = ssn.substring(6);
		String firstFiveDigits = "*******";
		System.out.println(firstFiveDigits + lastFourDigits);
		
		scan.close();
	}

}
