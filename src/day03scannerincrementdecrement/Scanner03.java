package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner03 {
/*
Type a program which calculates the volume of a rectangular prism whose length, width and height are entered by user
	
 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
//	System.out.println("Enter the length...");
//	double length = scan.nextDouble();
//	System.out.println("Enter the width...");
//	double width = scan.nextDouble();
//	System.out.println("Enter the height...");
//	double height = scan.nextDouble();

	System.out.println("Enter the length, width and height...");
	
	double length = scan.nextDouble();
	
	double width = scan.nextDouble();
	
	double height = scan.nextDouble();
	
	System.out.println("The volume of prism: " + length*width*height);
	
	scan.close();

			

	}

}
