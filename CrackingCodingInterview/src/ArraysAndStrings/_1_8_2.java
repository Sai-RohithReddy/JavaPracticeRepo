package ArraysAndStrings;

public class _1_8_2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		_1_7.printArr(arr);
		System.out.println("*************");
		setZeros(arr);
		_1_7.printArr(arr);
	}

	private static void setZeros(int[][] arr) {
		boolean rowHasZero = false;
		boolean colHasZero = false;

		for (int j = 0; j < arr[0].length; j++) {
			if (arr[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i][0] == 0) _1_8.nullifyRow(arr, i);
		}
		for (int j = 1; j < arr[0].length; j++) {
			if (arr[0][j] == 0) _1_8.nullityCol(arr, j);
		}
		
		if (rowHasZero) _1_8.nullifyRow(arr, 0);
		if (colHasZero) _1_8.nullityCol(arr, 0);
	}

}
