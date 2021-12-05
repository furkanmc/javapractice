package day10loops;

import java.util.Scanner;

public class WhileLoop02 {
 
		public static void main(String[] args) {
	 /*
	  
	  
	  
	  
	  
	  */
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter an integer to see multiplication table");
	 int num=scan.nextInt();
	 int i=1;
	 while(i<=10) {
		 
		 System.out.println(num +"x" + i + "=" + num*i);
		 i++;
	 }scan.close();
 }
}
