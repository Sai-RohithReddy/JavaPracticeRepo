import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Third Numbewr: ");
		int c = sc.nextInt();
		
		// Method 1
		
		/*
		if (a > b && a > c) {
			System.out.println(a + " is Larger Number");
		}
		else if (b > a && b > c) {
			System.out.println(b + " is Larger Number");
		}
		else {
			System.out.println(c + " is Larger Numbedr");
		}
		*/
		
		// Method 2 -- using Ternary Operator
//		int largest = a > b ? a : b;
//		largest = c > largest ? c : largest;
		
		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		
		System.out.println(largest);
		

	}

}
