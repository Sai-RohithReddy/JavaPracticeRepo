//creating methods/constructors with same name with different parameters
//it saves memory and time
//it differs based on Number of parameters and date type of parameter
package Polimorphism;

public class OopPolyMethodOverloading {
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
	 
		OopPolyMethodOverloading mo = new OopPolyMethodOverloading();
		
		mo.add(10, 20);
		mo.add(10, 20.0);
		mo.add(20.0, 30.0);
		mo.add(20, 10, 30);

	}

}
