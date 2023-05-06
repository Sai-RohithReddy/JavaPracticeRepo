package Inheritance;

class A
{
	int a;
	
	void displayA()
	{	
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void displayB()
	{
		System.out.println(b);
	}
}

public class InheritanceSingle {
	
	
	public static void main(String[] args) {
		
		System.out.println("Parent class");
		
		A aobj = new A();
		aobj.a = 100;
		aobj.displayA();
		
		System.out.println("Child class");

		
		B bobj = new B();
		bobj.a = 200;
		bobj.b = 300;
		bobj.displayA();
		bobj.displayB();

	}

}
