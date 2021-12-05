package day22inheritance;

public class Runner {

	public static void main(String[] args) {

	Dog dog1 = new Dog();// dog is class dog1 is object.
	System.out.println(dog1.age);
	dog1.eat();
	dog1.drink();
	dog1.giveBirth();
	dog1.feedWithMilk();
	dog1.bark();

	Mammal mammal1 = new Mammal();
	
	}

}
