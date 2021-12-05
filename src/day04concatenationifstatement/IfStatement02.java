package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {
	// If you want to compare values of 2 strings use equal(), do not use "=="
	// equals() checks the values of the String but == checks the values and the addresses of the String
	public static void main(String[] args) {
		// Ask user to enter ant day name, then print if it is "weekday" or "weekend" day.
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a day name");
		String dayName = scan.next();
		
		if( dayName.equalsIgnoreCase ( "Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||dayName.equalsIgnoreCase("Friday") ) {
			System.out.println("Week day");
		}
		else if( dayName.equalsIgnoreCase( "Sunday") || dayName.equalsIgnoreCase("Saturday") ) {
			System.out.println("Weekend");
			}
			else {
				System.out.println("hey user, enter the name correctly");
			}
		scan.close();
		}
//		if( dayName.equals( "Tuesday" )) {
//			System.out.println("Week day");
//		}
//		if( dayName.equals( "Wednesday" )) {
//			System.out.println("Week day");
//		}
//		if( dayName.equals( "Thursday" )) {
//			System.out.println("Week day");
//		}
//		if( dayName.equals( "Friday" )) {
//			System.out.println("Week day");
//		}
//		if( dayName.equals( "Saturday" )) {
//			System.out.println("Weekend");
//		}
//		if( dayName.equals( "Sunday" )) {
//			System.out.println("Weekend");
//		}
	}

