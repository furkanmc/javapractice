package day12variabletypesmethodoverloadingconstructors;

public class CarRunner {

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.make);//Honda
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.year);
		Car c2=new Car("Audi", "R8", 32000, 2021);
		System.out.println(c2.make);
		System.out.println(c2.model);
		System.out.println(c2.price);
		System.out.println(c2.year);
		Car c3=new Car("Mercedes", "c300", 20000, 2019);
		System.out.println(c3.make);
		System.out.println(c3.model);
		System.out.println(c3.price);
		System.out.println(c3.year);
	}

}
