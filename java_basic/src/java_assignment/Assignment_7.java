//Program to count the number of digits in number.
package java_assignment;

public class Assignment_7 {
/*
	public static void main(String[] args) 
	{
		int i = 0003452, t = 0;
		
		while(i != 0) 
		{
			i /= 10;
			t++;
		}
		System.out.println(t);//The program ignores any zero's present before the number. Hence, for digits like 000333, the output will be 3.
	}
*/
	public static void main(String args [])
	{
		int i = 12345, t = 0;
		
		for (; i > 0; i /= 10, t++)//i != 0
		{
		}
		System.out.println(t);
	}
	
}
