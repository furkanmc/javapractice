package day04concatenationifstatement;

public class Concatenation01 {
/*
   If you join 2 or more Strings, you can use "+" or "concat()"
   
   Note: if you are sure data types of s3 and s4 are same, you can use the following syntax.
   String s3 = "Ali", s4 = "Can";
   
   Note: If you use many methods side by side , it is called "method chain"
 */
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "is easy";
		String s4 = "Adventure ".concat(s2).concat(" ").concat(s1);
		//1. Way
		System.out.println(s1+ " " +s2);//Java is easy
		System.out.println(s4);
		//2. Way
		System.out.println(s1.concat(" ").concat(s2));
		
		String s3="Java";
		int i1=5;
		int i2=3;
		
		System.out.println(s3+i1+i2);//Java53 can not add 5 and 3 because starting with string
		
		System.out.println(i1+i2+s3);//8Java can add since starting with integer
		
		System.out.println(s3+(i1+i2));//Java8 can add too since we use parenthesis

	}

}
