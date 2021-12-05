package day07stringmanipulations;

public class StringManipulation01 {
/*
 Regex(Regular Expression): Regex is used the declare a group of characters
 i) All lower case letters==> [a-z]
 ii) All upper cases==> [A-Z]
 iii) All upper and lower case letters ==> [a-zA-Z], all except letters [^a-zA-Z], all letters+numbers==>[a-zA-Z0-9]
 iv)All characters different from space character ==> \\S
 v) Space character ==> \\s
 vi) All characters different from digits ==> \\D or [^0-9]
 vii) digit characters ==> \\d or [0-9]
 viii) characters from a to z from A to Z, from 0 to 9 and _ ==> '\\w
 ix) characters different from  a to z from A to Z, from 0 to 9 and _  ==> \\W 
 */
	public static void main(String[] args) {
		
		//Type code to find the number of the space characters in a String
		String s1 = "Ali went to the school.";
		String updateds1 = s1.replaceAll("\\S","");
		System.out.println(updateds1.length());
		
		
		//Type code to find the number of character different from space character
		
		//1.Way: Number of all character - Number of space = Number of characters different from space character
		int numfCharsDiffFromSpace =  s1.length() - updateds1.length();
		System.out.println(numfCharsDiffFromSpace);
		//2. Way: Find the characters different from space directly
		String updated2s1 = s1.replaceAll("\\s", "");//  \\s means just space characters, "" putting nothing for space chars
		System.out.println(updated2s1.length());
		
		// 3. Way: type to code to find the number of digits, number of letters and characters different from digits and numbers.
		String s2= "Ali Can :1234567890!!?  .";
		
		String updateds2 = s2.replaceAll("\\D", "");
		System.out.println(updateds2.length());//10
		
		String updated2s2 = s2.replaceAll("[^a-zA-Z]", "");
		System.out.println(updated2s2.length());
		
		String updated3s2 = s2.replaceAll("[a-zA-Z0-9]","");//[a-zA-Z0-9] means letter and digits all
		System.out.println(updated3s2.length());
		
		
		/*
		 4) Check the password according to the given rule
		 	A) NO SPACE
		 	B) AT LEAST ONE DIGIT
		 	C) AT LEAST ONE UPPER CASE
		 	D) AT LEAST ONE LOWER CASE
		 	E) AT LEAST ONE SYMBOL
		 
		 */
		
		String psw = " 123Abc! ";
		boolean isFirstCharSpace = psw.startsWith("");
		System.out.println(isFirstCharSpace);
		boolean isLastCharSpace = psw.endsWith(" ");
		System.out.println(isLastCharSpace);
		int numOfDigitChars = psw.replaceAll("\\D", "").length();
		int numOfUpperLetter = psw.replaceAll("\\[^A-Z]","").length();
		int numOfLowerLetter = psw.replaceAll("\\[^a-z]","").length();
		System.out.println(numOfUpperLetter + numOfLowerLetter);
		
		int numOfSymbolChars = psw.replaceAll("[a-zA-Z0-9]", "").length();
		System.out.println(numOfSymbolChars);
		
		if(isFirstCharSpace) {
			System.out.println("Please do not use space at the beginnig");}
		if(isLastCharSpace) {
			
			System.out.println("Please do not use space at the end");
		}
		if(numOfDigitChars==0) {
			System.out.println("Please use at least one digit");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
