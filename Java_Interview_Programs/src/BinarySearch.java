import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int target = 60;
		
		int start = 0;
		int end = arr.length-1;
		
		boolean flag = false;
		while (start <= end) {
			int mid = start + end - start / 2;
			
			if (arr [mid] == target) {
				System.out.println("Element found at index: " + mid);
				flag = true;
				break;
			}
			
			if (arr[mid] > target) {
				end = mid - 1;
			}
			
			if (arr[mid] < target) {
				start = mid + 1;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}
		
		System.out.println(Arrays.binarySearch(arr, 8));

	}

}
