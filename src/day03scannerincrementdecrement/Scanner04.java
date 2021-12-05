package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner04 {
/*
   Get the firstname, middle name, SSN from user hen print them like following
   Ali Mert Can
   1232345345 
 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your firstname...");
		
		String firstName = scan.next();
		
		System.out.println("Enter your middlename...");
		
		String middleName = scan.next();
		
		System.out.println("Enter your lastname...");
		
		String lastName = scan.next();
		
		
		
		System.out.println("Enter your SSN...");
		String ssn = scan.next();
		
		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(ssn);
		scan.close();

	}

}
