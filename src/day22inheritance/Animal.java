package day22inheritance;

/*
  	1) Private class members can not be used child classes
  	2) Default class members can be used by child classes if the 
  	child class in the same package with parent class
  	3) Protected class members can be used by child classes
  	4) Public class members can be used by child classes
  	5) To use static class members no need to create object, use them
  	by class name.
  	6) super() is dor calling parent constructor
  	even if you don not type ot  java will put it as default invisible.
  	7)super() must be in the first line inside the constructor
  	8) this() and super() must be in the first line inside the constructor.
  	they cannot be used at same time in a constructor.
  	9) Java does not support multiple inheritance
  	a child class connot have multiple paretns
 */
public class Animal {
	
	public Animal() {
		super();
		System.out.println("Animal Constructor....");
	}
	
	int age;
	public  void eat() {
		System.out.println("They eat ...");
	}
	public void drink() {
		System.out.println("They drink ...");
	}
}
