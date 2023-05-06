//diff b/w Method and Constructor

//Method:
//name can be anything
//it can return a value
//need to call method explicitly
//it is used to write logic

//Constructor:
//name must be same as class name
//it doesn't return a value
//Automatically invoked at the time of object creation
//it is used to initializing values or variables

package java_basic;
 
public class ConsturctorDemo {
	// there are 2 types of constructors
	int x;
	int y;
	// default constructor
	ConsturctorDemo()
	{
		x = 10;
		y = 20;
	}
	// parameterized constructor
	ConsturctorDemo(int a, int b)
	{
		x = a;
		y = b;
	}
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		ConsturctorDemo cm = new ConsturctorDemo();//Invokes default constructor
		cm.display();
		
		ConsturctorDemo cm1 = new ConsturctorDemo(100,200);//Invokes parameterized constructor
		cm1.display();
		
	}

}
