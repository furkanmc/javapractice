package day28exceptions;

public class Exception01 {

	public static void main(String[] args) {
		Object obj1 =5;
		convert(obj1);
		String s1="139";
		String s2="1a23b";
		String s3="";
		convertStringToInteger(s1);//This is integer: 139
		convertStringToInteger(s2);//NumberFormatException: .....
		convertStringToInteger(s3);//NumberFormatException
}
	public static void convert(Object obj) {
		
		try {
		String convertedString = (String) obj;//Explicit narrowing
		System.out.println(convertedString);//ClassCastException: .....
}catch(ClassCastException e) {
	System.out.println("Some data connot be converted to other data types - " + e.getMessage());
}
	}
	public static void convertStringToInteger(String str) {
		
		try {
			int parsedString = Integer.parseInt(str);
		System.out.println("This is integer: "+parsedString);
		}catch(NumberFormatException e) {
		System.out.println(str +" cannot be parsed to integer: "+e.getMessage());	
		}
	}
}
