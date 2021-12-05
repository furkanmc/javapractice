package day12variabletypesmethodoverloadingconstructors;
	/*
	 1) Constructor is for creating object from a class.
	 2) Every class has a default constructor, default constructor are invisible.
	 3)When you create a constructo, Java removes the default constructor.
	 4) how to create our own constructor.
	 	i)Type access modifier make it "public" most of times.
	 	ii)Type the class name
	 	iii) open-close parenthesis
	 	iv) open close curly braces
	 5)Default Constructor is like;"public Car() {}"
	 6)Constructors do not have a "return type" since they are not method. They are constructor.
	 7)Constructor names must match with Class names.
	 */
public class Car {

	String make;
	String model;
	int price;
	int year;
	//Constructor can be overloaded as well //public is access modifier
	public Car() {//constructor is not a method. there is no return type as void
		this.make="Honda";
		this.model="Pilot";
		this.price=40000;
		this.year=2021;
//constructor name must me same the class name. we can not change it.		
	}
	public Car(String make, String model,int price, int year) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
		int y;
		
	}
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println(x);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
