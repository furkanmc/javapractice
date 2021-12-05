package day09loops;

public class revision01 {
	
	public static void main(String[] args) {
		//1)Type code to print unique characters on the console
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a word...");
//		String s=scan.next();
		String s1="para";
		for(int i=0;i<s1.length();i++) {
			char c1=s1.charAt(i);
			if(s1.indexOf(c1)==s1.lastIndexOf(c1)) {
				System.out.println(c1);
			}
		}//scan.close();
		//2)Type code to print a String in reverse after removing spaces
		//  Example: Ali Can ==> naCilA
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a word...");
//		String s2=scan.next();		
		String	s2="Ali Can";										
		String reserved = "";
		for (int i=s2.length()-1;i>=0;i-- ) {
			char c=s2.charAt(i);
			if(c != ' ') {
				reserved = reserved + c;			
			}	
		}
		System.out.println(reserved);
		//3)Type code to find the sum of the integers from 12 to 231
		int sum=0;
		for(int i=1;i<10;i++) {
			sum=sum+i;
		}System.out.println(sum);//45
		//4)Type code to find the multiplication of the integers from 3 to 5
		int multi=1;
		for (int i=3;i<6;i++) {
			multi=multi*i;
		}System.out.println(multi);//60
		//5)Type code to check if a given String is Palindrome.
				//  String: anna  Reversed String: anna
				//  Intgeger: 12321  Reversed Integer: 12321
		String s5="Ahmet";
		String rev="";
		for(int i=0;i<s5.length();i++) {
			char c=s5.charAt(i);
			rev=rev+c;
			
	
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}
}