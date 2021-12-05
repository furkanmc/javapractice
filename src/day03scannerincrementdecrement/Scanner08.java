package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
/*
		Type a program which converts the hours to seconds. Hours value will be
		entered by user. (Use long)
		Hint 1: second = hour x 60 x 60
		Hint 2: To get long, use nextLong()
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of hour:");
		long hour = scan.nextLong();
		System.out.println(hour + " hours are " + hour * 60 * 60 + " seconds");
		scan.close();
	}

}
