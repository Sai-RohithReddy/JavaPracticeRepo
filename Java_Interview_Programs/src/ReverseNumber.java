import java.util.Scanner;

// 3 ways of Reverse a Number
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int num = sc.nextInt();
		// Method 1 - using algorithm
		
		/*
		int rev = 0;
		
		while (num !=  0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		*/
		
		// Method 2 - using StringBuffer class
		
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/
		
		// Using StringBuilder class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reversed Number is: " + rev);

	}

}
