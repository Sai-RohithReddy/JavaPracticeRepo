
public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = {5,2,7,9,6};
		int sum = 0;
		
//		for (int i = 0; i <= arr.length-1; i++) {
//			sum += arr[i];
//		}
		
		for (int value : arr) {
			sum += value;
		}
		System.out.print(sum);
	}

}
