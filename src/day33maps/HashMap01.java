package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 How to count the number of occurrences of the words in a sentence
		    For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
		    Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
 */
public class HashMap01 {

	public static void main(String[] args) {
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
//		str = str.replace(".", "");
		//According to Java "Java" and "JAva." are different words but in our task they are same.
		//So we must remove all punctuation marks
		//to and To are different for Java but in mur tasy they should be same.
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();//String is inmutable so we must assign to str.
		System.out.println(str);
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words));//[java, is, easy, type, codes, to, learn, java, to, earn, money, learn, java]
		
		HashMap<String, Integer> result = new HashMap<>();// {         } 
		for(String w:words) {
			Integer numOfOccurence = result.get(w);//get the number of accoraunce we use get()
			if(numOfOccurence==null) {//If the word does not exist in the Map if-body will be executed
				result.put(w, 1);
			}else {
				result.put(w, numOfOccurence+1);
			}
			
			
		}System.out.println(result);
		
	}

}
