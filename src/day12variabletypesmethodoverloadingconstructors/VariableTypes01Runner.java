package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		VariableTypes01 obj1 = new VariableTypes01();
		System.out.println(obj1.name);//Ali can
		VariableTypes01 obj5 = new VariableTypes01();
		System.out.println(obj5.numberOfEyes);
		
		obj1.name= "Veli Han";
		System.out.println(obj1.name);	//veli han	
		System.out.println(obj1.id);//Null
		obj1.id="New Id";
		System.out.println(VariableTypes01.id);//New Id
//Note: "id" has yellow underline because you created an object to access static variable
		//no need to it because class name is enough to access
		VariableTypes01 obj2 = new VariableTypes01();//ali can
		System.out.println(obj2.name);//Ali Can
		System.out.println(obj2.id);//New Id
	}

}
