package SuperKey;

public class Animal {
	String color = "white";
	
	void eating()
	{
		System.out.println("Eating...");
	}
	
	Animal()
	{
		System.out.println("Animal is created");
	}

}

class Dog extends Animal
{
	String color = "Black";
	
	void display()
	{
		System.out.println(color);
		//super can be used to refer immediate parent class instance variable.
		System.out.println(super.color);
	}
	
	void eating()
	{
		System.out.println("Eating Bread...");
		//super can be used to invoke immediate parent class method.
		super.eating();
	}
	
	Dog()
	{
		//super();//Invokes parent class constructor
		System.out.println("Dog is created");
		// super(); it need to be called first.
	}

}