
public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		
		int[] arr = {50, 30, 40, 20,60};
		
		int max = arr[0], min = arr[0];
		
		for (int val : arr) {
			if (val > max) {
				max = val;
			}
			if (val < min) {
				min = val;
			}
		}
		System.out.println("Max is: " + max +" "+ "Min is: " + min);

	}

}
