// If we don't use any modifier, it is treated as default by default. The default modifier is accessible only within package.
package accessModifiers;
class B
{
	int data = 10;
	void m1() {
		System.out.println(data);
	}
}
public class SampleDefault {

	public static void main(String[] args) {
		
		B bobj = new B();
		bobj.data=20;
		bobj.m1();

	}

}