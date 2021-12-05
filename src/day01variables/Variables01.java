package day01variables;

public class Variables01 {

	//Statement in Java = Sentence in English
	//    ;     in java =     .    in English
	
	//How to create Variables?
	// 1) access Modifier  2)Type data type	3)Type a name for the variable 4) = 5) type a value for the variable 6) ;
	//In "public int age = 12;", "public int age" is called "Variable Declaration"
	//In "public int age = 12;", "= 12" is called "Value Assignment"
	
	//While a type code in the Eclipse, if you get "red underline" it means you made a mistake
	
	// of you create declare a variable without assigning any value in "main method|,
	// when you try to use it it will give you "red underline"
	//So do not try to use a variable inside the main method without assigning any value
	//While you type code on Eclipse, if you get yellow underline, it is not big issue.
	//Most probably you created a variable but you did not use it yet.
	public static void main(String[] args) {
		
		int age = 12;
		System.out.println(age);
		
		int height = 5;
		System.out.println(height);
		
		//Declare a char variable
		char initial;
		
		
		//Assign 'S' to "initial" variable
		initial = 'H';	
		System.out.println(initial);
	}
	
	
}




