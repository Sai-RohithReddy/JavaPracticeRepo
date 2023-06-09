package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashMap hm= new HashMap();
		
		HashMap <Integer,String> hm= new HashMap <Integer,String> ();
		
		//Adding pairs into hashmap
		
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(105, "Smith");
		
		System.out.println(hm);
		
		// Remove a pair from hashmap
		hm.remove(102);
		System.out.println(hm);
		
		//Reading pairs using for loop
		
		for (Map.Entry m:hm.entrySet())//Map.Entry is a datatype used to loop pairs
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

	}

}
