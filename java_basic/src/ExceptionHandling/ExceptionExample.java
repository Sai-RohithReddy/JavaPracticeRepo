package ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a = 100;
		try
		{
		System.out.println(a/0); // Arthemetic Exception
		}
		catch(ArithmeticException e)
		{
			System.out.println("entered Arithmetic Catch block");
		}
		
		
		String s = null;
		try
		{
		System.out.println(s.length()); //Nullpointer Exception
		}
		catch(Exception e)
		{
			System.out.println("Entered in to catch block..");
		}
		
		
		String x = "abc";
		try
		{
		int i = Integer.parseInt(x); // NumberFormatException
		}
		catch(Exception e)
		{
			System.out.println("Entered in to catch block....");
		}
		finally
		{
			System.out.println("Entered in to finally block");
		}
		
		int arr[]=new int[5];
		//arr[10]=100; // ArrayIndexOutOfBoundsException

	}

}
