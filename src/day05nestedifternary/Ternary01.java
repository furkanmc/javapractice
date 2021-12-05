package day05nestedifternary;

public class Ternary01 {

	public static void main(String[] args) {
		//if an integer is positive print 'Integer is positive' otherwise print "Integer is not positive"
		// ternary is shorter, executed faster, 
		int num = -12;
		//Solve by using if-else
		if(num>0) {
			System.out.println("Integer is positive");
		}else {
			System.out.println("Integer is not positive");
		}
			//Solve by using ternary
		String result = num>0 ? "Integer is positive" : "Integer is not positive"; // ":" behaving like else 
		System.out.println(result);
		
		//Wrrite a program to print the minimum of 2 integers on the console. use ternary...
		int n1 = 23;
		int n2 = 23;
		int min = n1 < n2 ? n1 : n2;
		System.out.println(min + " is the minimum");
		// Write a program to print value of an integer entered bu user. abs(-12)=12, abs(5)=5
		// to make that multiply negative numbers bu -1
		
		int n3 = - 10;
		int abs= n3 >= 0 ? n3 : n3*-1;
		System.out.println(abs + " is the absolute value of " + n3);
		
	}

}
