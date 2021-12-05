package day02variablesscanner;

public class Day02VariablesMemory {

	public static void main(String[] args) {
		/*
		 Data Types in Java
		 Note: In JAva , there are 2 main data types
		 		1) Primitive Data Types: 	
		 			a)boolean: it has 2 different values which are "true" and "false" 
		 						Every boolean variable uses a single "bit" in memory
		 						booleans have "false" as default value
		 			b)char: it used for a single character. 
		 					value must be put between single quotes like 'S'
		 					every char uses 16 bits in the memory
		 			c)byte: it is used for 'whole numbers' between -128 and 127
		 			 		it uses 8 bits from memory.
		 			 		if you are not sure value will be between -128 and 127, then do not use it
		 			 		
		 			d)short: it is used for "whole numbers" between -32768 and 32767
		 			 		 it uses 16bits from the memory
		 			 		 if you are not sure the value will be between -32768 and 32767, then do not use it
		 			e)int:   it used for "Whole numbers" between -2.147.483.468 and 2.147.483.467
		 					 it uses 32 bits
		 			f)long:  it uses for "Whole numbers" between -9.223.372.036.854.755.808 and 9.223.372.036.854.755.807
		 			 		 it uses 64 bits
		 			 Note: every whole number is "int" for Java as default. When you create a "long" variable, you have to 
		 			 put "L" or "l" to end to inform Java, the number is not int it is long. Otherwise you will get error. 
		 			g)float: it us used for "Decimal Numbers"
		 			  		 it uses 32 bits
		 			 Note: Every decimal number is “double” for Java as default. 
			    		    When you create a “float” variable, you have to put
			    		    “F” or “f” to the end to inform Java, the number is not double, it is float.
			    		    Otherwise you will get error
			    		    You can have 7 digits in decimal part at most. 	
		 			h)double: It is used for decimal numbers
		 					  it uses 64 bits from memory
		 					  You can have 16 digits in decimal part at most.
		 	Note: "=" is used to assign value to a variable
		 		  "==" is used to compare 2 values if they are equal to each other
		 		  "!=" means "not equal to"
		 	Note: If all values in a operations is integer the result will be in Java
		 		  If the result is decimal in Math, Java converts the decimal to integer by removing decimal part.
		 		  Java do not rounding decimals.
		 		   
		 		2) Non-primitive Data Types
		 			String: it used for "Multiple Characters"
		 		
		 		Note: "Stack Memory" is small and contains i) primitive data
		 												   ii) Addresses (references) of the non-primitive data
		 				"Heap Memory" is large memory and contains non-primitive data
		 		
		 		Note: What is difference between "primitive" and "non-primitive" data types?
		 		a) Primitive data types names are just typed by using lower cases, but non-primitive
		 		data types use upper case at the beginning
		 		b) primitive data types are just 8, but non-primitive data types are unlimited
		 		c) Primitive data types were created by Java, we cannot create primitive data types
		 		But non=primitive data types can be created by Java and by developers.
		 		d) Primitive data types are stored in "Stack Memory" and non=primitive data types are stored in 
		 		"Heap Memory"
		 *******e) Primitive data types have just values in them.
		 **********But non-primitive ones have "values" and "methods" in them
		 */
		
		byte age = 12;
		System.out.println("Age: " + age);//Age: 12
		
		short populationOfAVillage = 2000;
		System.out.println("Population: " + populationOfAVillage);//Population: 2000
		
		int profit = 2000000000;
		System.out.println("The profit: $" + profit);// The profit: $2000000000
		
		long numberOfCellsInHuman = 3529856521454758L;
		System.out.println("The number of human cells: " + numberOfCellsInHuman);
		
		float f = 1.2f;
		System.out.println("The value: " + f);
		
		double d = 1.2;
		System.out.println("The value: " + d);
		
		String stdName = "Ali Can";
		System.out.println("Student name: " + stdName);
		System.out.println(stdName.toUpperCase());//ALI CAN
		System.out.println(stdName.toLowerCase());//ali can
		System.out.println(stdName.contains("i"));//true
		System.out.println(stdName.contains("x"));//false
		
		
		
		
	}

}
