package day10loops;

public class WhileLoop01 {

	public static void main(String[] args) {
// Type code to print "Hi!" 5 times on the console by using for-loop
		
		for(int i=1; i<6;i++) {
			System.out.println("Hi!");
		}
		// Type by using While-loop
		int i=1;
		while(i<6) {
			System.out.println("Hello!");
			i++;//If you forget the this you will have infinite loop
		}
		
		
	}

}
