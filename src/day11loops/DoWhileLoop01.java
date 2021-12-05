package day11loops;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		//While-loop body may not be executed for some conditions. but Do-while body executed at least once.
		int i=0;
		do {
			System.out.println("Hello!");
			i++;
		}while(i<0);
	}

}
