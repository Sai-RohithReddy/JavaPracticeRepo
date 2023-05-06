import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,2,1,5,3};
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Array after sorting: " + Arrays.toString(arr));
		
		
		Arrays.sort(arr);
		Arrays.parallelSort(arr);
		System.out.println("Sorting array using Built-In methods: " + Arrays.toString(arr));
		
		//Arrays.sort(arr, Collections.reverseOrder());// premitives are not supported here we need to use derived data type.
		Integer[] arrr = {4,2,1,5,3};
		Arrays.sort(arrr, Collections.reverseOrder());
		System.out.println("Array after reversed sort: " + Arrays.toString(arrr));
	}

}
