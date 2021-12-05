package day25interfaceencapsulation;
/*
	1)"Encapsulation" means "data-hiding"
	2)To encapsulate, we use "private" keyword.
	3)By the help of "encapsulation" you will be able to do many tasks by suing just a single object.
	  i)Create an object   i)By using setters update the values which you need then work with newly updated object
	Note: Static cannot be encapsulated 
	Note2: Fully Encapsulation means;
			i) All variables should be private
			ii) All getters and setters should be created
*/
public class Students {
	private String name = "Ali Can";
	private int grade = 11;
	private boolean isSuccussful = true;
	

	public Students() {
	}


	public Students(String name, int grade, boolean isSuccussful) {
		this.name = name;
		this.grade = grade;
		this.isSuccussful = isSuccussful;
	}
	
	
	//getName()is called "getter" this is for reading data //makes immutable**
	//getter uses data type as return type
	public String getName() {
		return name;
	}
	//setName()is called "setter" this is for updating data in usage  //makes mutable**
	//setter uses void as return type
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	//if variable type is boolean ==> get becomes is
	public boolean isSuccussful() {
		return isSuccussful;
	}
	public void setSuccussful(boolean isSuccussful) {
		this.isSuccussful = isSuccussful;
	}
// if you want to see objects on the console create toString()
	@Override
	public String toString() {
		return "Students: name=" + name + ", grade=" + grade + ", isSuccussful=" + isSuccussful ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
