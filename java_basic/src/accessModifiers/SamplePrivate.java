// private access modifier is accessible only within class.
package accessModifiers;

class A
{
	private int data = 10;
	private void m1() {}
}
public class SamplePrivate {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.data=20; //compile time error
		aobj.m1(); // compile time error

	}

}
