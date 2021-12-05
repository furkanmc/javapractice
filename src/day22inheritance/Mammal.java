package day22inheritance;

public class Mammal extends Animal{
	
	public Mammal() {
		super();
		System.out.println("Mammal Constructor....");	
	}
	
	public void giveBirth() {
		System.out.println("They give birth ...");
	}
	
	public void feedWithMilk() {
		System.out.println("They feed their babies with milk ...");
	}
}
