package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// How to declare array list
		
		ArrayList list = new ArrayList();  // we can store any type of element's.
		
		//ArrayList <String> list = new Arraylist <String> (); // only Strings 
		//ArrayList <Integer> list = new Arraylist <Integer> (); // only Strings 
		
		//Adding values to arraylist
		
		list.add("John");
		list.add("David");
		list.add("Scott");
		
		//Size of array list
		System.out.println(list.size());
		System.out.println("Before removing elements: " + list);
		
		//remove an element
		list.remove(1);
		System.out.println(list.size());
		System.out.println("After removing elements: " + list);
		
		//inserting a new element into array list
		list.add(1,"Sam");
		System.out.println(list.size());
		System.out.println("After inserting elements: " + list);
		
		list.add(100);
		list.add('a');
		
		//read values from array list using for loop
		/*
		for (String s:list)
		{
			System.out.println(s);
		}
		*/
		
		for (Object o:list)//Object type variable can hold any type of datatype
		{
			System.out.println(o);
		}

	}

}
