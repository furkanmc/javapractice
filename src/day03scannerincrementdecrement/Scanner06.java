package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		/*
		Type a program which calculates the perimeter of a triangle whose
		Side lengths are entered by user. (Use byte)
		Hint 1: Perimeter of a triangle is a + b + c
		Hint 4: To get byte, use nextByte()
		 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the side length of the treangle...");
	byte a = scan.nextByte();
	byte b = scan.nextByte();
	byte c = scan.nextByte();
	System.out.println("Perimeter of the triangle: "+(a+b+c));
	scan.close();

	}

}
