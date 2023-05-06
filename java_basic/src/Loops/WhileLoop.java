package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		int a = 0;
		
		while (a <= 10)
		{
			System.out.println(a);
			a += 2; //a = a+2;
			/*
			if (a % 2 ==0)
			{
				System.out.println(a);
			}
			a++;
			*/
		}
		System.out.println("************************");
		
		int b = 10;
		
		while(b >= 1)
		{
			System.out.println(b);
			b--;
		}

	}

}
