/*
 * An interface in java is a blueprint of a class.
 * Interface contains final and static variables.
 * Interface contains abstract methods.
 * An abstract method is a method contains definition but not body.
 * Methods in interface are public by default.
 * Interface supports the functionality of multiple inheritance.
 * We can define interface with interface keyword.
 * A class extends another class, an interface extends another interface but a class implements an interface.
 * We can create Object reference for Interface but we cannot instantiate interface.
 */

package Interfaces_MultipleAndHybridInheritance;

interface A
{
	int a = 10; // by default variables in interface are static and final
	
	void m1(); // abstract method, by default public
}

public class DemoInterface implements A {
	
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		DemoInterface d = new DemoInterface();
		d.m1();
		
		A a = new DemoInterface();
		a.m1();

	}

}
