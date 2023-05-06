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

class C extends B
{
	int c;
	void displayC()
	{
		System.out.println(c);
	}
}

public class InheritanceMultilevel {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.a = 100;
		aobj.displayA();
		
		B bobj = new B();
		bobj.a = 100;
		bobj.b = 200;
		bobj.displayA();
		bobj.displayB();
		
		C cobj = new C();
		cobj.a = 100;
		cobj.b = 200;
		cobj.c = 300;
		cobj.displayA();
		cobj.displayB();
		cobj.displayC();

	}

}
