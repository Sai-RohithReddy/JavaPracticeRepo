package Oop;

public class OopThisKeyword {
	
	int a,b;// instance variables or class variables
	
	void getValue(int x, int y)// method variables or external variables
	{
		a = x;
		b = y;
	}
//or
	void getValue1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		OopThisKeyword tk =new OopThisKeyword();
		tk.getValue(10,20);
		tk.printValues();
		
		OopThisKeyword tk1 =new OopThisKeyword();
		tk1.getValue1(100,200);
		tk1.printValues();
	}

}
