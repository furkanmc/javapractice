package day12variabletypesmethodoverloadingconstructors;
/*
 		There are 3 main variable types in Java
 		1) Local Variables: Variables created in method body "age" and "sum" are local variables
 							NOTE 1: Local Variables can be used just inside the method body which you created it in.
 							NOTE 2:Do not use local variables without initializing(assigning a value) otherwise you get compile time error.
 		2)Instant(object) Variables: Variables created outside of all methods and inside the class without using "static" keyword
									"name" is a instant (object) variable
							NOTE1: If you initialize instant variable, if you want to not initialize
									If you do not initialize Java puts "default values" for the instance variables
					default values: String==> null
									byte, short, int, long float double==> 0
									boolean==>false
									char==>nothing==> ''
							NOTE 2: Instance Variables are atteched to every object.
		3)Class Variables: Variables created by using "Static" keyword, "id" is a class variable.
							Note1: Class(static) Variables are common for all object created from the class(Like moon)
							Note2: Every update on class variables will be visible by all objects(like splitting moon)
							Note3: If you need a variable which all objects need to share make it "class(object) variable"
									If you need all objects should see every update on a variable make the variable"Class(static) Varible"
	 Note for instance and Static variables: to access an "Instance Variable" from another class, you have to create "Object"
	 										but to access "Class Variable" from another class, no need to create object
	 										you can access to a "Class Variable" by using just class name
	 */
public class VariableTypes01 {
	String name="Ali Can";
	boolean isOld;
	static String id;
	static int numberOfEyes=2;
	
	public static void main(String[] args) {
		int age = 13;
		System.out.println(age);
	}
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
