package day10loops;

import java.util.Scanner;

public class WhileLoop06 {
	//Get String from user and print just vowels inside String on the console
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scan.nextLine();
		//1. way
		int idx = 0;
		while(idx<s.length()) {
			char c =s.charAt(idx);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')  
				System.out.print(s.charAt(idx));
			idx++;
		}
		System.out.println();
		//2. Way
		String s1 = s.replaceAll("[^aeouiAEIOU]", "");
		System.out.println(s1);scan.close();
	}
	}


