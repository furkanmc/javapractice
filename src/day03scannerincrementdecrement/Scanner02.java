package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner02 {
	/*
	 Type a program which calculates the area and perimeter of a rectangle whose length and width are entered bu yser
	 Hint1: Area of a rectangle is widthxlength
	 Hint2: Perimeter of a rectangle is 2x (width+length)
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle...");
		double length = scan.nextDouble();
		
		System.out.println("Enter the width of rectangle...");
		double width = scan.nextDouble();
		
		System.out.println("The area of the rectangle: " + length*width);
		System.out.println("The perimeter of the rectangle: " + 2*(length + width));
		scan.close();


	}

}
