package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
//Check if array elements are sorted or not
	public static void main(String[] args) {
		String s1[] = {"a","t","c"};
		System.out.println(Arrays.toString(s1));
		//if you do not use copy of you will get s1 and s2 sorted automatically.
		//when you do direct assignment java does not create a new container to save memory.
		//but copyOf() makes java create a new container even arrays are same
		String s2[] = Arrays.copyOf(s1, s1.length);// **************************important****************
		//String s1[] = s1; ===> java creates a pool that makes two same but not creating new container in heap memory.
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		if(Arrays.equals(s1, s2)) {
			System.out.println("Arrays elements are sorted");	
		}else {
			System.out.println("Arrays elements are not sorted");

		}
	}

}
