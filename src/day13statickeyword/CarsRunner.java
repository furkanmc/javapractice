package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
		//Inside the car class we have 6 variables but we can access 
		//just static variable which is numOfCars
		System.out.println(Cars.numOfCars);
		Cars c1 = new Cars();//Creating object named c1
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		
		//Static variables can access bu using 
		//object but nor recommended.  so yellow underline 
		System.out.println(c1.numOfCars);
		//engine() is static so we can access to it by class name
		System.out.println(Cars.engine());
					
		// no need syso because it has already syso.
		c1.drive();//it is non static so we must use c1 object
		System.out.println(c1.engine());//not recommend because it is static. yellow underline
	
		Cars c2= new Cars("Honda", "Civic", 7000,2017);
		String vinC2 = Cars.createVin(c2);
		System.out.println(vinC2);
		System.out.println(c1.numOfCars);
		Cars c3= new Cars("Audi","R8",57000,2021);
		String vinC3 = Cars.createVin(c3);
		System.out.println(vinC3);
		System.out.println(c1.numOfCars);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
