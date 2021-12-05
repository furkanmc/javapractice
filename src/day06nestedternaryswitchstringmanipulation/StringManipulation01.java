package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string...");
//		String str = scan.nextLine();
//		//Print the first anf last character of the given String on the console. "Java is easy" ==> Jy
//		char firstChar = str.charAt(0);
//		char lastChar = str.charAt(str.length()-1);
//		
//		if (str.length()==1) {
//			System.out.println(firstChar);
//		}else {
//		System.out.println("" + firstChar + lastChar);
//		}
//		// Print the index of first occurence of 'a' if it exists. otherwise print no 'a'.
////		int idx = str.indexOf("a");//char or string both works,
////		if(idx==-1) {
////			System.out.println("No 'a'");
////		} else {
////		System.out.println(idx + " is the index");// if you use non existing character in indexOf() method you will get -1 
//		//if you use multiple character in indexOf() , it returns the index of first character
//		//if there are multiple character in the string it ireads first occurance.
//		
//		
//		//Print the index of last occurrence of a specific character
//		int lastIndex = str.lastIndexOf("a");// works with char or string
//		System.out.println(lastIndex + " is the last index");
//		
//		//****Check if a given character is unique in a String or not?
//		char c = 'a';
//		int firstOccurenceIdx = str.indexOf(c);
//		int lastOccurenceIdx = str.lastIndexOf(c);
//		if (firstOccurenceIdx == -1)
//			System.out.println("In the string, there is no " + c);
//		
//		else if(firstOccurenceIdx == lastOccurenceIdx) {
//			System.out.println(c + " is unique");
//		}else {
//			System.out.println(c + " is not unique");
//				
//		}
		
		// Get the initials of the first name and last name of the user. Aliye Canan==> AC 
		
//		char initialOfFirstName = str.charAt(0);
//		char initialOfLAstName = str.charAt(str.indexOf(" ")+1);
//		System.out.println("" + initialOfFirstName + initialOfLAstName);
//		
//		
//		//Get character from index 3 to index 7 from a string
//		String subString = str.substring(3, 8);// In substring() method first index is inclusive, second is exclusive
//		System.out.println(subString + " are characters from index3 to index 7");
//		
//		//Get character from index 3 to the end in a string
//		String sub =  str.substring(3, str.length());//Note if we write just substring(3) that means from index 3 to the end.
//		System.out.println(sub);
		/*
		  String shirtPrice = $12.99
		  String trousersPrice = $25.99
		  type code to calculate the sum of the shirt and trouser prices.
		 
		 */
		 String shirtPrice = "$12.99";
		 String trouserPrice = "$25.99";
		 
		 String updatedShirtPrice = shirtPrice.replace("$", "").replace(".", "");
		 System.out.println(updatedShirtPrice);
		 
		 String updatedTrouserPrice = trouserPrice.replace("$", "").replace(".", "");
		 System.out.println(updatedTrouserPrice);
		 
		 System.out.println(("$") + (Integer.valueOf(updatedShirtPrice) + Integer.valueOf(updatedTrouserPrice))/100.0);
		
		
		 scan.close();
		
		
		
		
		
		
	} 
	}


