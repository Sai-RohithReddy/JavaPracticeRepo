package Array;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		
		Q4 q4 = new Q4();
		
		int[] arr1 = {1,2,3,1};
		int[] arr2 = {1,2,3,4};
		
//		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
		
		System.out.println(q4.containsDuplicate(arr1));
		System.out.println(q4.containsDuplicate(arr2));
		
		System.out.println();
		
		System.out.println(q4.containsDuplicateEnhanced(arr1));
		System.out.println(q4.containsDuplicateEnhanced(arr2));


	}
	public boolean containsDuplicate(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j =  i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;
				}
			}
		}
		
		return false;
	}

	public boolean containsDuplicateEnhanced(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) return true;
		}
		return false;
	}
}
