package Inheritance;

class Parent
{
	int a;
	
	void display()
	{ 
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}

class Child2 extends Parent
{
	int c;
	
	void print()
	{
		System.out.println(c);
	}
}
public class InheritanceHierarchy {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.a = 100;
		c1.b = 200;
		c1.display();
		c1.show();
		
		Child2 c2 = new Child2();
		c2.a = 100;
		c2.c = 300;
		c2.display();
		c2.print();
	}

}
