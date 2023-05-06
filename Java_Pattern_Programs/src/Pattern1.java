// Triangle
public class Pattern1 {

	public static void main(String[] args) {
		triangle(10);
	}
	static void triangle(int row_num) {
		int col = row_num - 1;
		for (int i = 0; i < row_num; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" ");
			}
			col--;
			for (int k = 0; k < i + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
