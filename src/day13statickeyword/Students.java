package day13statickeyword;
//Type code to count number of objects created from student class
public class Students {
	public String name;
	public int age;
	public static int numOfStudents;
	public String studentId;
	
	public Students() {
		this.name="Ali Can";
		this.age=12;
		numOfStudents++;
		this.studentId = name.substring(0,1) + age + numOfStudents;
		
	}
	
	public Students(String name, int age) {
		this.name=name;
		this.age=age;
		numOfStudents++;
		this.studentId = name.substring(0,1) + age + numOfStudents;
			 
	}
	public Students(String name) {
		this.name=name;
		numOfStudents++;
		this.studentId = name.substring(0,1) + age + numOfStudents; 
	}
	public static void main(String[] args) { 
		System.out.println("Before sdt1 creation: " + numOfStudents);
		Students sdt1 = new Students();
		System.out.println(sdt1.studentId);
		Students sdt2 = new Students();
		System.out.println("After sdt1, std2 creation: " + numOfStudents);
		System.out.println(sdt2.studentId);
		Students sdt3 = new Students("Veli Han", 13);
		System.out.println("After sdt1, std2 and sdt3 creation: " + numOfStudents);
		System.out.println(sdt3.studentId);
		Students sdt4 = new Students("Ali Han");
		System.out.println("After sdt1, std2, sdt3 and sdt4 creation: " + numOfStudents);
		System.out.println(sdt4.studentId);
	}

}
