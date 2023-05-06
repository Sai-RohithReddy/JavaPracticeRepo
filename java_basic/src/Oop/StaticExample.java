package Oop;

public class StaticExample {
	
	static int a = 10;//static variable
	int b = 20;//non-static variable
	
	static void m1()//static method
	{
		System.out.println("this is m1 - static method");
		
		//not best practice always create objects in main method
		StaticExample se = new StaticExample();
		System.out.println(se.b);
	}
	
	void m2()//Non-static 
	{
		System.out.println("this is m2 - Non-static method");
	}
	
	void m3()
	{
		System.out.println("This is m3 method...Non-static");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		//static methods/variables can access only static stuff(directly) without creating objects
		System.out.println(a);
		m1();
		//if we have main class in different file we can access them by class name
		System.out.println(StaticExample.a);
		StaticExample.m1();
		
		//System.out.println(b); incorrect, bcoz is non-static variable
		//m2(); incorrect, bcoz is non-static method
		
		//static methods can also access non-static stuff but through objects
		StaticExample se = new StaticExample();
		
		System.out.println(se.b);//non-static variable through object
		se.m2();//non-static method through object
		
		//Non static methods can access both static and non static stuff directly. 
		se.m3();

	}

}
