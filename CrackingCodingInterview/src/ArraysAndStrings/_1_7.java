package ArraysAndStrings;

public class _1_7 {

	public static void main(String[] args) {
		int[][] arr1 = {
				{1, 2},
				{3, 4}
		};
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		printArr(arr2);
		System.out.println("******************");
		rotateArr(arr2);
		printArr(arr2);
		
	}
	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean rotateArr(int[][] arr) {
		if (arr.length == 0 || arr.length != arr[0].length) return false;
		int n = arr.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offSet = i - first;
				int top = arr[first][i];
				arr [first][i] = arr[last - offSet][first];
				arr[last - offSet][first] = arr[last][last - offSet];
				arr[last][last - offSet] = arr[i][last];
				arr[i][last] = top;
			}
		}
		return true;
	}
}
