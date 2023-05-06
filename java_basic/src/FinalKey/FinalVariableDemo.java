package FinalKey;

public class FinalVariableDemo {
	
	final int speed = 50;// final variable, so we cannot change this value

	public static void main(String[] args) {
		
		FinalVariableDemo fv =new FinalVariableDemo();
		System.out.println(fv.speed);

		
		fv.speed = 100;//compile time error  
		System.out.println(fv.speed);

	}

}
