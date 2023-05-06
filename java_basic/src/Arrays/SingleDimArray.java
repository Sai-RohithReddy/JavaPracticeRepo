package Arrays;

public class SingleDimArray {

	public static void main(String[] args) {
		//declaring an array with size 5
		int a[] = new int[5];
		//inserting values into array
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;
		
		//declaring an array without specifying size
		int []b = {100,200,300,400,500};
		
		System.out.println("Length of an array is: "+a.length);
		
		System.out.println(b[0]);
		
		System.out.println("**********************");
		
		for (int i = 0; i <= a.length-1; i++) // or i<a.length
		{
			System.out.println(a[i]);
		}
		
		System.out.println("**********************");
		
		//read values using enhanced/advanced for loop
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
