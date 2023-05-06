package Interfaces_MultipleAndHybridInheritance;

class A1
{
	void m1()
	{
		System.out.println("This is m1 method from A1 Class.");
	}
}

interface B1
{
	void m2();
}

interface B2
{
	void m2();
}
public class HybridInheritance extends A1 implements B1,B2 {
	
	public void m2()
	{
		System.out.println("This in m2 from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("This in m3 from B2 interface");
	}

	public static void main(String[] args) {
	 
		HybridInheritance h = new HybridInheritance();
		h.m1();
		h.m2();
		h.m3();

	}

}
