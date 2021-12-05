package day05nestedifternary;

import java.util.Scanner;

public class nestedIf01 {
	 /*
 	Ask user to enter a password 
	
	If the initial of the password is uppercase then check if it is ‘A’ or not. 
	If it is ‘A’ the output will be “Valid Password” 
	otherwise the output will be “Invalid Password”
	For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
	
	If the initial of the password is lowercase then check if it is ‘z’ or not. 
	If it is ‘z’ the output will be “Valid Password” 
	otherwise the output will be “Invalid Password”
	For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
 */

/*
 	Note: Every character in a String has index. 
 	      Indexes start from zero so the index of first character is zero.
 	      Index of last character in a String equals "the number of characters - 1 as charAt(-1)"
 	     
 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password...");
		String psw = scan.next();
		char firstChar = psw.charAt(0);	// putting container to use all time. no need repeatation
		if(firstChar>='A' && firstChar<='Z') { //psw.charAt(0)>='A' && psw.charAt(0)<='Z' makes first letter upper case
			if(psw.charAt(0)=='A') {
				System.out.println(psw + " is a valid password");
				
			}else {
				System.out.println(psw + " is not a valid password");
			}
		}
		else if(firstChar>='a' && firstChar<='z') { //psw.charAt(0)>='a' && psw.charAt(0)<='z' makes first letter lower case 
				if(firstChar=='z') {
					System.out.println(psw + " is a valid password");
					
				}else {
					System.out.println(psw + " is not a valid password");
				}
				
			}else {
			System.out.println("First character should be letter");
			
		}
		scan.close();
		}

	}


