package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 How to count the number of occurrences of the letters in a sentence
		  For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
		         Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
 */
public class HashMap02 {

	public static void main(String[] args) {
		String str="Java is easy. Type codes to learn Java. To earn money learn Java.";
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
		String letters[] = str.split("");
		System.out.println(Arrays.toString(letters));
		
		HashMap<String, Integer> resultMap = new HashMap<>();
		for( String w : letters) {
			Integer numOfOccurences = resultMap.get(w);
			if(numOfOccurences==null) {
				resultMap.put(w,1);
				
			}else {
				resultMap.put(w, numOfOccurences+1);
			}
		}System.out.println(resultMap);
		
	}

}
