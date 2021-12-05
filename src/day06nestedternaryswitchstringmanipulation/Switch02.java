package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class Switch02 {
/*
 Ask user to enter month number.
 your code will print all month names starts with the month whose is given by user
 11==>November December
 9==> September October November December
 
  Note: in Switch we can use byte, short and int. 
  				  we cannot use long, boolean, decimals(fload,double)
  				  we can use Char as monthNumber==scan.next().charAt(0);
  				  						case 'J'
  				  						case 'F'
  				  we can use String
  				  we can use Wrapper classes for whole numbers as Integer monthNumber = scan.nextInt();
  	
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number...");
		int monthNumber = scan.nextInt();
		switch(monthNumber) {
		case 1:
			System.out.println("January");
		case 2:
			System.out.println("February");
		case 3:
			System.out.println("March");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("June");
		case 7:
			System.out.println("July");
		case 8:
			System.out.println("August");
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("October");
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
			break;
		
		default:
			System.out.println("Enter a valid month number");
		}
		scan.close();
	}

}
