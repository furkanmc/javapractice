package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03 {
// Type code to print the seasons after getting months name from user
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a month name");
		String monthName = scan.next();
		
		if( monthName.equalsIgnoreCase ( "december") || monthName.equalsIgnoreCase("February") || monthName.equalsIgnoreCase("January") ) {
			System.out.println("Winter");
		}
		else if( monthName.equalsIgnoreCase ( "March") || monthName.equalsIgnoreCase("April") || monthName.equalsIgnoreCase("May") ) {
			System.out.println("Spring");
			}
		else if( monthName.equalsIgnoreCase ( "June") || monthName.equalsIgnoreCase("July") || monthName.equalsIgnoreCase("Augost") ) {
			System.out.println("Summer");
			}
		else if( monthName.equalsIgnoreCase ( "September") || monthName.equalsIgnoreCase("October") || monthName.equalsIgnoreCase("November") ) {
			System.out.println("Autumn");
			}
		else {
			System.out.println("Are you sure " + monthName + " is a month?"); }
		scan.close();

	}

}
