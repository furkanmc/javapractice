package day17foreachloopmultidimentiomalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//1. Example: Find the vowels in a String by using arrays
		String s = "Learn Java, earn money";
		String chars[] = s.split("");
		System.out.println(Arrays.toString(chars));
		for(String w : chars){//w new letter for each elements in chars array. 
			//we dont use == for strings. we must use .equals()
			if(w.equalsIgnoreCase("a") || w.equalsIgnoreCase("e") || w.equalsIgnoreCase("i") || w.equalsIgnoreCase("o") || w.equalsIgnoreCase("u")) {
				System.out.print(w + " ");
			}
			
		}
		System.out.println();
		//2. example : Print the words ending with"n"
		String t = "Learn Java, earn money.";
		System.out.println(t);
		//remove all punctiotion marks to get just words
		t = t.replaceAll("\\p{Punct}", "");// \\p{Punct} removes all punctiation marks
		String words[] = t.split(" ");
		
		System.out.println(t);
		System.out.println(Arrays.toString(words));
		
		for(String w:words) {
			
			if (w.endsWith("n") || w.endsWith("N")) {
				System.out.print(w + " ");
				
			}
			
		}System.out.println();
		//3. Example: Find the sum of the digits of an integer given by using arrays
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String n = scan.next();
		String digits[] = n.split("");
		System.out.println(Arrays.toString(digits));
		int sum = 0;	
		for(String w:digits)  {
				sum = sum +Integer.valueOf(w);	
			}
		System.out.println(sum);
		scan.close();
	}

}

























