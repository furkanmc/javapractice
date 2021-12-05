package day11loops;

public class DoWhileLoop03 {
/*
 
 
 
 */
	public static void main(String[] args) {
		String s = "1234_?!abcdef";
		//1.Way
		s= s.toLowerCase();
		int digitCounter=0;
		int letterCounter = 0;
		int othersCounter = 0;
		int idx = 0;
		do {
			if(s.charAt(idx)>='a' && s.charAt(idx)<='z') {
				letterCounter++;
			}else if(s.charAt(idx)>='0' && s.charAt(idx)<='9') {
				digitCounter++;
			}else {
				othersCounter++;
			}
			idx++;
	}while(idx<s.length());
System.out.println("Digits:" +digitCounter);
System.out.println("Letters:" +letterCounter);
System.out.println("Others:" +othersCounter);
		//2. way
 	String t = "A5b67seCe_+===$#%$^&*";
 	String justDigits=t.replaceAll("[^0-9]", "");
 	String justLetters=t.replaceAll("[^a-zA-Z]", "");
 	String justOthers=t.replaceAll("[a-zA-Z0-9]", "");
 	System.out.println("number of letters: " + justLetters.length());
 	System.out.println("number of digits: " + justDigits.length());
 	System.out.println("number of others: " + justOthers.length());




}
}