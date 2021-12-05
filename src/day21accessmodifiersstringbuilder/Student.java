package day21accessmodifiersstringbuilder;

public class Student {
		
		//If you use private as access modifier it means you hid the data
		//If the access modifier is private it is impossible to see from other classes
		private  String name = "Ali Can";
		
		//If you do not type any access modifier it means it is default.
		//If the access modifier is default, data will be visible inside the entire package
		int age = 13;
		
		
		//if you use protected access modifier you can access to it
		//from inside the entire package and from every child classes 
		//even they are in different packages
		protected int grade = 11;
		
		//If you use public access modifier the class member will be visible from entire the project
		//there is no any restriction
		public String country = "USA";
		
		
		
}		
