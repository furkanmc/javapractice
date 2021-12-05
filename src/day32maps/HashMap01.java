package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
	1)Maps use key-value structure
	2)"key"s must be unique, "value"s can be duplicated
	3)"key"s cannot be null except in HashMaps, in HashMaps you can use "null" just once
	4)In HashMaps"value"s can use "null" many times
	
	5)HashMap does not put the elements in any order because of that HashMap is super fast
	6)If you try to send into a map repeated key, Java will overwrite the value
	7)HashMap is not thread-safe and not synchronized
	
*/
public class HashMap01 {

	public static void main(String[] args) {
		//How to put elements into a map
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(100, "Ali");
		hm1.put(101, "Veli");
		hm1.put(102, "Aliye");
		hm1.put(103, "Veliye");
		hm1.put(null, "Mary");
		hm1.put(null, "Kemal");
		hm1.put(104, null);
		hm1.put(105, null);
		hm1.put(106, " ");
		
		System.out.println(hm1);//{100=Ali, 101=Veli}
		
		HashMap<Integer, String> hm2 = new HashMap<>();
		hm2.put(87, "X");
		hm2.put(88, "Y");
		hm2.put(89, "L");
		hm1.putAll(hm2);//it puts all elements hm2 into hm1 by ignoring order
						//When you use putAll() method data type of keys must match and type of values must match, otherwise get CTE
		hm1.putIfAbsent(102,  "Z");// JAva will put Z if 102 key does not exist. overwrite is not working in this method
		hm1.putIfAbsent(999,  "Z");// 999 does not exist as key, java put it.
		System.out.println(hm1);
		
		//How to put data from a map
		String el1 = hm1.get(101);
		System.out.println(el1);//veli
		//If you use non existing key get() returns null
		String el2 = hm1.get(111);
		System.out.println(el2);//null
		//If 111 exists in the map you will get its value, if it does not you will get a message from second parameter
		String el3 = hm1.getOrDefault(111, "THere is no any key like that");
		System.out.println(el3);
		String el4 = hm1.getOrDefault(999, "THere is no any key like that");
		System.out.println(el4);//Z
		//keySet() returns all keys in a Set Collection
		Set<Integer> myKeys =  hm1.keySet();
		System.out.println(myKeys);//[null, 100, 101, 102, 103, 87, 999, 104, 88, 105, 89, 106]
		
		Collection<String> myValues=hm1.values();
		System.out.println(myValues);//[Kemal, Ali, Veli, Aliye, Veliye, X, Z, null, Y, null, L,  ]
		
			//converting Map to Collection
		Set<Map.Entry<Integer, String>> setFromMap = hm1.entrySet();
		for(Map.Entry<Integer, String> w:setFromMap) {
			System.out.print(w+ " ");
		}
		
		
		
		
		//How to update a value in a map
		String val1=hm1.replace(999, "Zehra");
		System.out.println(val1);//Z
		
		//To replace JAva checks to conditions key and old value.
		boolean val2=hm1.replace(89, "L", "Leyla");
		System.out.println(val2);//True
		
		//How to remove an element from a map
		String val3 = hm1.remove(87);
		System.out.println(val3);//X (which removed).
		
		boolean val4 = hm1.remove(null, "Kemal");
		System.out.println(val4);
		System.out.println(hm1);
		
		
	}

}
