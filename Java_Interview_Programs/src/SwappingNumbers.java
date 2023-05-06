// 5 ways to swap numbers.
public class SwappingNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20;
		
		System.out.println("Before swapping values are.." + a + " " + b);
		
		// Logic 1 - Using Third Variable.
		
		/*
		int temp = a;
		a = b;
		b = temp;
		*/
		
		// Logic 2 - Use + & -
		
		/*
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 20 - 10 = 20
		*/
		
		// Logic 3 - Use * and /
		// Here a and b values should not be Zero.
		
		/*
		a = a * b; // 10 * 20 = 200
		b = a / b; // 200 / 20 = 10
		a = a / b; // 200 / 10 = 20
		*/
		
		// Logic 4 - Bitwise XOR (^)
		
		/*
		a = a ^ b; //10 ^ 20 = 30
		b = a ^ b; //30 ^ 20 = 10
		a = a ^ b; //30 ^ 10 = 20
		*/
		
		// Logic 5 - Single statement
		
		b = a + b - (a = b);  
		
		System.out.println("After swappint values are.." + a + " " + b);

	}

}
