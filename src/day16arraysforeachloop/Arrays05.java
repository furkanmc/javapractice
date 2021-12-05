package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

	public static void main(String[] args) {
		//find the longest word in a String
		String s="Ali can went to school to learn";
		String words[]=s.split(" ");
		System.out.println(Arrays.toString(words));//[Ali, can, went, to, school, to, learn]
		
		Arrays.sort(words, Comparator.comparing(String::length));//:: means look at the inside of string to check length
		System.out.println(Arrays.toString(words));//[to, to, Ali, can, went, learn, school]
		System.out.println(words[words.length-1]);
		
		Arrays.sort(words, Comparator.comparing(String::length).reversed());
		System.out.println(Arrays.toString(words));//[school, learn, went, Ali, can, to, to]
		System.out.println(words[0]);
		
		//Get the year from date in mm/dd/yyyy format
		String date = "10/5/2021";
		String arr[] = date.split("/");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);//2021
		
		//Get the initials of the students names
		String t = "Ali Can, Veli Han, Mary Star went to school by bus";
		String u[] = t.split(", ");
		System.out.println(Arrays.toString(u));//[Ali Can, Veli Han, Mary Star went to school by bus]
		
		String initials="";
		
		for(int i=0; i<u.length;i++) {
			int idx = u[i].indexOf(" ");
			initials = u[i].substring(0,1) + u[i].substring(idx + 1,idx + 2);
			System.out.print(initials + " ");
			
		}
		
		
 	}

}
