package day08loops;

public class ForLoop01 {

	public static void main(String[] args) {
// Type code tp print "Hello!" 10 times on the console
		//1.Way: Not Recommended
	
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");

		System.out.println("==============================");
		/*
		 2. Way: For repeated task you can use loops. 
		 		i) for-loop
		 		ii)while-llop
		 		iii)do-while-loop
		 		iv)for-each-loop	 
		 */
			for(int i2 = 1;i2 <= 10; i2++) {
			System.out.println("Hello!");
		}
			System.out.println("==============================");
		//Type all integers from 11 to 44 in the same line with a space between consecutive integers
//			for(int i = 11;i < 45; i++) {
//				System.out.print(i + " ");
//			}	
		//Type all even integers from 11 to 120 in the same line with a space between consecutive integers
//			for(int j = 6;j <= 60; j++) {
//				System.out.print(2*j + " ");// my way not recommended
//				
			
			System.out.println("==============================");
			
			for(int i=11; i<121 ; i++) {
				if(i%2 == 0) {
			System.out.print(i+" ");
			}
			}
			System.out.println("==============================");
			for (int i1=12;i1<121;i1=i1+2) {
			//System.out.print(i1 + " ");
			}
			//Type all odd integers from 120 to 11 in the same line with a space between consecutive integers
			
			for(int i=120;i>10;i--) {
				if(i%2!=0) {
					
					//System.out.print(i + " ");
				}
			}
			//Type all odd integers which are divisible by 4 and by 6 from 120 to 11 in the same line with a space between consecutive integers
			for(int i=120;i>10;i--) {
				if(i%4==0 && i%6==0) {
			
					//System.out.print(i + " ");
			}
			}
			//Convert Java to J*a*v*a*
			String s = "Javamer";
			// If insttead of s.length() you use just 4 it means your loop works just for four characters.
			//we do not want it because our code should work for every kind of Strings.
			//if you use specific values in your code it called "Hard Coding" and "Hard Coding" is not acceptable
			for(int i=0 ;i<s.length() ; i++ ) {
				System.out.print(s.charAt(i)+ "*");
			}
			// Type code to print all unique characters on the console from given string
			//  samame==> se
			
			String a= "Universe";
			for (int i= a.length()-1;i>=0;i--) {
				char b=a.charAt(i);
						if(a.indexOf(b)== a.lastIndexOf(b)) {
							System.out.print(b);
						}
				;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
	
	

