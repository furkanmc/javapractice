package day16arraysforeachloop;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//for-each-loop is the best loop to use
		//it can be used with the containers which have multiple elements
		//it can be used with arrays
		
		//Get the total number of characters in the elements
		String s[]= {"Ali Can", "Veli Han", "Mary Star"};
		int sum=0;
		for(int i=0; i<s.length;i++) {
			sum = sum + s[i].length();
		}System.out.println(sum);
		
	}

}
 