package day03scannerincrementdecrement;

import java.util.Scanner;

public class ModulusOperatior01 {
	//When do we need the remainder in division operations we use "modulus operator"
	//The symbol of modulus is %
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers, make the first greater");
		int bigInt= scan.nextInt();
		int smallInt = scan.nextInt();
		
		int width = bigInt%smallInt;
		int lentgh = bigInt+smallInt;
		
		System.out.println("The area is " + width*lentgh);//44
		System.out.println("The perimeter is " + 2 * (width + lentgh));//48
		
		scan.close();
	}

}
