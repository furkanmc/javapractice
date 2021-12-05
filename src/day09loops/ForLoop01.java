package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		//Type code to print unique characters on the console
//		String s1="Anna Maria";
//		for(int i=0;i<s1.length() ;i++) {
//			char c = s1.charAt(i);//will get the character from index
//			if(s1.indexOf(c)==s1.lastIndexOf(c)) {
//			System.out.print(c);
//			}
//		}
		//2. Type code to print a string in reverse order after removing spaces
													//		String s2="Ali Can";
													//		String reversed = "";
													//		for (int i=s2.length()-1;i>=0;i--) {
													//			String c=s2.substring(i, i+1);
													//					if(c.equals(" ")) {
													//				 		s2=s2.replace(" ", "");
													//					}else {
													//						reversed = reversed + c;
													//					}
													//			
													//		}
													//		System.out.println(reversed);
		String s2="Ali Can";
		String reversed = "";
		for (int i=s2.length()-1;i>=0;i--) {
			char c = s2.charAt(i);
					if(c!=' ') {
				 	reversed = reversed + c;
					}
			
		}
		System.out.println(reversed);
		
		//3. Type code to find the sum of the integers from 12 to 231
		int sum=0;
		for(int i=12;i<232;i++) {
			sum = sum+i;
		}
		System.out.println(sum);//26730	
		
	//4. Type code to find the multiplication of the integers from 3 to 7
	int product=1;
	for(int i=3;i<8;i++) {
		product = product*i;
	}
	System.out.println(product);//2520
	}
	
	

}
