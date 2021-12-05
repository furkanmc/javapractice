package day21accessmodifiersstringbuilder;

public class Varargs01 {

	public static void main(String[] args) {
		
		System.out.println("The sum: " + add());//0
		System.out.println("The sum: " + add(7));//7
		System.out.println("The sum: " + add(7, 9));//16
		System.out.println("The sum: " + add(7, 9, 11, 14, 45, 34, 35, 56, 67, 87, 66));//431
		System.out.println("The sum: " + join('a', 'l', 'i', 'y', 'e'));//ALIYE
	}
	/*
	 	In a method you can not use multiple varargs
	 	In a method after the varargs you cannot use any other parameters so varargs must be the last parameters.
	 	Before the varargs you can put many parameters no limitation.
	 	
	 */
	public static int add(int... a) {
		int sum = 0;
		for(int w:a) {
			sum = sum+w;		
		}
		return sum;
		
	}
	public static String join(char... c) {
		String name = "";
		for(char w : c) {
			name = name + w;
			name = name.toUpperCase();
		}
		return name;
	}
}
