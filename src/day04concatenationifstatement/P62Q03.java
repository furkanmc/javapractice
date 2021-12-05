package day04concatenationifstatement;

import java.util.Scanner;

public class P62Q03 {
//Ask user to enter a character, then check whether the character is alphabet or not
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//If else method
		System.out.println("Enter a letter...");
		char ch=scan.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')  ) {
			System.out.println( ch + " is a letter"  );	
		}else{
			System.out.println( ch + " is not a letter"  );
		}
		
		//Ternary way
		System.out.println("Enter a letter again...");
		char c=scan.next().charAt(0);
		String result = (c>='a' && c<='z') || (c>='A' && c<='Z') ? c + " is a letter" :c + " is not a letter";
		System.out.println(result);
		
		//isAlphabetic() method
		System.out.println("Enter a letter 3rd time...");
		char c1=scan.next().charAt(0);
		if(Character.isAlphabetic(c1)) {
			System.out.println(c1 + " is a letter" );	
		}else {
			System.out.println(c1 + " is not a letter" );
		}
		//Absolute value by ternary way
		System.out.println("Enter an integer...");
		int a=scan.nextInt();
		int res = a>=0 ? a : a*-1;
		System.out.println(res);	
	}
}
