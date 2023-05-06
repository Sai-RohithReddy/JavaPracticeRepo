// Program to find greatest of 3 numbers
package java_assignment;

public class Assignment_5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 100;
		int c = 100;
		
		if (a > b && a > c)
		{
			System.out.println("A is big");
		}
		else if (b > c && b > a)
		{
			System.out.println("B is big");
		}
		else if (c > a && c > b)
		{
			System.out.println("C is big");
		}
		else
		{
			System.out.println("Invalid numbers");
		}

	}

}
