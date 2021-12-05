package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	//Type code to find the nmber of words in a string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string...");
		String s = scan.nextLine();
		//How to split a string by using any character
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words));//[ali, can, went, to, school]
		System.out.println("Number of words: " + words.length);//5
		
		//count how many words starts with "a"
		int count = 0;
		for(int i=0;i<words.length;i++) {
			if(words[i].startsWith("a")) {
				count++;
			}
		}
		System.out.println("Number of words start with 'a' is " + count);
		
		String d= "10/11/2021";
		//String year[] = d.split("/");
		System.out.println(d.split("/")[2]);
	}
	

}
