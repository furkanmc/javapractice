package day24abstractclass;
	/*
	 	1) Abstract method: any method without body
	 	   Abstract methods can exist inside abstract classes
	 	   To make a class abstract, type "abstract" keyword after access modifier
	 	   Concrete method: any method with body
	 	2) To create abstract method 
	 		i) It will not have method body
	 		ii) We type "abstract" keyword after access modifier
	 	3) Abstract classes can have abstract methods and concrete methods
	 	4) i) abstract methods must be overridden by child class
	 	   ii) concrete method is optional to be overridden by abstract child class
	 	   iii) concrete methods is optional to be written overridden by child class
	 	5) Abstract classes can have concrete and abstract child classes
	 	6)If an Abstract method is overridden in a parent class 
	 	  then it becomes optional to override in child classes 
	 	7) Abstract method cannot be final. Final methods body cannot be changed,
	 	   but abstract methods must be overridden in concrete child class
	 	   This is a contradiction
	 	8) Abstract method cannot be private.
	 	9) Abstract method can be protected and default.
	 */

public abstract class Animal {
	public abstract void eat();
	
	public void drink() {
		System.out.println("Animals drink...");
		
	}
}
