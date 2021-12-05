package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter your full name");
		 String fullName = scan.nextLine();
		 System.out.println(fullName);
		 
		 //1. Remove spaces from beginnig and at the end
		 String trimmedFullName = fullName.trim();
		 System.out.println(trimmedFullName);
		 //2. Check if theString is empty(no character) String.
		 boolean isTheStringEmpty = fullName.isEmpty(); 
		 System.out.println(isTheStringEmpty);
		 //3. Check if the String is blank(no character or just space character) String
		 boolean isTheStringBlank = fullName.isBlank();
		 System.out.println(isTheStringBlank);
		 // product without prices,
		 scan.close();
	}

}
