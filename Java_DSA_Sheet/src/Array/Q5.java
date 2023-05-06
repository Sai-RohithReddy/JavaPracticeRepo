package Array;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		Q5 q5 = new Q5();
		
		int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
		
		int res = q5.chocolateDistribution(arr, 7);
		System.out.println("Miniumn difference is: " + res);
	}
	public int chocolateDistribution(int[] arr, int m) {
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		if (n == 0 || m == 0) {
			return 0;
		}
		
		if (n < m) {
			return -1;
		}
		
		int min_diff = Integer.MAX_VALUE;
		
		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m -1] - arr[i];
			if (diff < min_diff) {
				min_diff = diff;
			}
		}
		return min_diff;
	}
}
