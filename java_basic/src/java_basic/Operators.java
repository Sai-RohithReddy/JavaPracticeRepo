package java_basic;

public class Operators 
{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		
		//Arithmetic operators --> + - * / %
		
		System.out.println("Sum of a and b:"+ (a+b));
		System.out.println("Diff of a and b:"+ (a-b));
		System.out.println("Mul of a and b:"+ (a*b));
		System.out.println("Div of a and b:"+ (a/b));
		System.out.println("Mod of a and b:"+ (a%b));

		//Relational Operators (Comparison operators) --> == < > <= >= !=
		//Always return boolean value
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		//Logical Operators && || !
		//Works between two boolean
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Increment/Decrement operators ++ --
		
		a = 10;
		a++;  //a = a+1
		System.out.println(a);
		
		b = 20;
		b--; //b = b-1
		System.out.println(b);
		
		// Assignment Operators =
	}

}
