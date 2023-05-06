package ArraysAndStrings;

public class _1_8 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,0,3},
				{4,5,6},
				{7,8,9}
		};
		_1_7.printArr(arr);
		System.out.println("*************");
		setZeros(arr);
		_1_7.printArr(arr);
	}
	public static void setZeros(int[][] arr) {
		boolean[] row = new boolean[arr.length];
		boolean[] col = new boolean[arr[0].length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for (int i = 0; i < row.length; i++) {
			if (row[i]) nullifyRow(arr, i);
		}
		
		for (int j = 0; j < col.length; j++) {
			if (col[j]) nullityCol(arr, j);
		}
	}
	public static void nullifyRow(int[][] arr, int row) {
		for (int j = 0; j < arr[row].length; j++) {
			arr[row][j] = 0;
		}
	}
	
	public static void nullityCol(int[][] arr, int col) {
		for (int i = 0; i < arr.length; i++) {
			arr[i][col] = 0;
		}
	}
}
