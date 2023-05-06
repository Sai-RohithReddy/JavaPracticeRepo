
public class FindMissingNumberInArrya {

	public static void main(String[] args) {
		
		// Array should not have duplicates
		// Array No need to be sorted order
		// Values should be in range
		
		int[] a = {1,2,3,4,5,7,8,9};
		
		// 1+2+4+5 = 12 sum1
		// 1+2+3+4+5 = 15 sum2
		// sum2 - sum1 = 3 missing
		
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1+a[i];
		}
		System.out.println("Sum of elements in array: " + sum1);
		
		// Finding the sum of range
		int sum2 = 0;
		for (int i = a[0]; i <= a[a.length-1]; i++) {
			sum2 = sum2+i;
		}
		System.out.println("Sum of range of elemetns in array: " + sum2);
		System.out.println("Missing number are: " + (sum2 - sum1));
	}

}
