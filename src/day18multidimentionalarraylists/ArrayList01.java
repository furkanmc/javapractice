package day18multidimentionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
/*
 		CONS: Arrays are not flexible. you cannot change length of arrays.
  
 		1)ArrayList is flexible in length.
 		2)ArrayList accepts just non-primitive data types.
 */
	public static void main(String[] args) {
		//How to declare an ArrayList
		//1. Way
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);//[]
		//2. Way
		ArrayList<Integer> list2  = new ArrayList<>();
		System.out.println(list2);//[]
		//3. Way
		List<Integer> list3  = new ArrayList<>();
		
		//How to add elements into a list
		//add() method adds the elements to the end everytime. add() method add the elements into a list in insertion order.
		list3.add(12);
		list3.add(3);
		list3.add(7);
		
		//How to add an element into a specific index.
		list3.add(1, 8);
		list3.add(3,15);
		System.out.println(list3);//[12, 8, 3, 15, 7]
		
		//How to get number of elements in a list
		System.out.println(list3.size());//5
		System.out.println(list1.size());//0
		
		//How to check if a list is empty or not
		System.out.println(list1.isEmpty());//True
		System.out.println(list3.isEmpty());//false
		
		//How to check if a list has a specific element
		list3.contains(12);//true
		list3.contains(21 );//false
		
		//How to remove specific element from a list
		System.out.println(list3.remove(2));//8		//do not put integer elemen inside the remove() parenthesis. Java will use it as index
		System.out.println(list3);//[12, 3, 15, 7]
		
		List<String> list4 = new ArrayList<>();
		list4.add("Ali Can");	
		list4.add("Veli Han");
		list4.add("Mary Star");
		list4.add("Angelina Jolie");
		list4.add("Brad Pitt");
		System.out.println(list4);
		
		//If the list is integer index we have to use index. if it is not integer we may use the element itself in the the romeve() method
		list4.remove(2);
		System.out.println(list4);//[Ali Can, Veli Han, Mary Star, Angelina Jolie, Brad Pitt]
		
		list4.remove("Brad Pitt");//[Ali Can, Veli Han, Angelina Jolie, Brad Pitt]
	}

}



















