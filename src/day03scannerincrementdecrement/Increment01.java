package day03scannerincrementdecrement;

public class Increment01 {

	public static void main(String[] args) {
		
		int age = 12;
		System.out.println("Before increment: " + age);//12
		
		// 1. way
		age = age + 5; 
		System.out.println("After 1st increment: " + age);//17
		age = age * 2;
		System.out.println("After 2nd increment: " + age);//34
		//2. way
		age+=5;
		System.out.println("After 3rd increment: " + age);//39
		age*=2;
		System.out.println("After 4th increment: " + age);//78
		//3.way: This can be used just increase by 1
		age++;// means age+=1; and samely age = age +1
		System.out.println("After 6th ncreament: " + age);//79
		

	}

}
