package Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int a[][] = new int[3][2]; // 3 - rows, 2 - columns
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;

		//int b[][] = {{100,200},{300,400},{500,600}};
		System.out.println("Length of rows: "+a.length);
		System.out.println("Length of column: "+a[0].length);
		
		System.out.println("**************************");
		
		for(int row = 0;row < a.length;row++)//outer loop
		{
			for(int col = 0; col < a[row].length; col++) //inner loop
			{
				System.out.print(a[row][col]);
			}
		}
		System.out.println("");
		System.out.println("**************************");
		
		//Enhanced for loop
		
		for(int row[]:a) //100,200 it holds all row values at a time so we need to assign it to an array
		{
			for (int val:row)// extracting single-single value from outer loop array
			{
				System.out.println(val);
			}
		}

	}

}
