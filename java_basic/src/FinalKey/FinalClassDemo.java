//class cannot be extended into another class
package FinalKey;

final class Bike//final class, so ve cannot extedn into child class
{
	void run()
	{
		System.out.println("Running...");
	}
}

class Honda extends Bike// compile time error
{
	void run()
	{
		System.out.println("Started...");
	}
}

public class FinalClassDemo {
	
	public static void main(String[] args) {
		

	}

}
