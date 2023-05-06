package Array;

public class Q1 {

	public static void main(String[] args) {
		 
		int[] arr = {3, 5, 4, 1, 9};
		
		int min;
		int max;
		
		if (arr[0] < arr[1]) {
			min = arr[0];
			max = arr[1];
		} else {
			min = arr[1];
			max = arr[0];
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum element is: " + min);
		System.out.println("Maximum element is: " + max);
	}

}
