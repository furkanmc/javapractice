package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner09 {

	public static void main(String[] args) {
/*
		9)Type a program which asks user to enter his/her first name and last name,
		then print it on the console.
		Hint: To get String, use nextLine()
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name...");
		String firstName=scan.nextLine();
		System.out.println("Enter your last name...");
		String lastName=scan.nextLine();
		System.out.println(firstName + " " + lastName);
		scan.close();
		
	}

}
