package Polimorphism;

public class OopPolyConstructorOverloading {
	
	OopPolyConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	OopPolyConstructorOverloading(int a, double b)
	{
		System.out.println(a+b);
	}
	
	OopPolyConstructorOverloading(double a, int b)
	{
		System.out.println(a+b);
	}
	
	OopPolyConstructorOverloading(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		OopPolyConstructorOverloading co = new OopPolyConstructorOverloading(10,20);
		
		OopPolyConstructorOverloading co1 = new OopPolyConstructorOverloading(10,20,30);

	}

}
