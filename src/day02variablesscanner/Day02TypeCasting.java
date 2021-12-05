package day02variablesscanner;

public class Day02TypeCasting {
   /* 
    Type Casting: We want to convert a number primitive data type to another primitive type
    
    Number Primitive data types: byte < short < int < long < float < double
    
    
    
    
    */
	
	
	public static void main(String[] args) {
		//Auto Widening Type Casting: If you change small primitive data type to larger it is called Auto Widening Type Casting
		
		byte b1 = 12;
		short s1 = b1;
		
		int i1 = 123;
		float f1 = i1;
		
		double d1 = 2.34;
		//Explicit Narrowing Type Casting: If you change large primitive data type to smaller it is called Explicit Narrowing Type Casting
		float f2 = (float)d1;
		
		long l1 = 234;
		
		byte b2 = (byte)l1;
		
		System.out.println(l1);// 234
		System.out.println(b2);// -22
		
		// How to convert "primitive data type" to "Wrapper Class"
		// int ====> Integer			Integer ====> int
		
		//if you convert primitive top wrapper it id called "Auto Boxing"
		int i2 = 123;
		Integer i2Wrapper = i2;
		i2Wrapper.floatValue();
		
		Integer i3Wrapper = 234;
		int i3 = i3Wrapper;
		
		int d = 5/2;
		int i = (int)d;
		long l = (long)d;
		byte b = (byte)d;
		System.out.println(d);
		System.out.println(i);
		System.out.println(l);
		System.out.println(b);
		
		
		
	}

}
