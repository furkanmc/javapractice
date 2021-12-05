package day12variabletypesmethodoverloadingconstructors;

public class MethodOverloading01 {
	
	//If you use same method name for different methods t is called "method overloading"
//	Question: how do you archive "method overloading"
//				1) by using different number of parameters
//				2) by using different data types for parameters
	//			3) If the data types of parameters are different you can change the order.
	

	public static void main(String[] args) {
//		add(13, 15);//This is called "method call"
					//Real values used for parameters in method call are called "Arguments"
		add(-2, 5, 10);
		add(1.2,5);
		add(3, 5.2);
		add(2,3);
	}
//	public static void add(int a, int b) {//When you create a method if you create variables inside the method parenthesis 
//											// it is called "parameters" 
//		System.out.println("The sum is " + (a+b));
//	}
	public static void add(int a , int b , int c ) {
		System.out.println("@The sum is " + (a+b+c));
	}
	public static void add(double x, int y) {
		System.out.println("@@The sum is "+ (x+y));
	}
	public static void add(double x, double y) {
		System.out.println("@@@The sum is "+ (x+y));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
