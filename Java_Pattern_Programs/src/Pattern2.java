
public class Pattern2 {

	public static void main(String[] args) {
		p2(5);
	}
	public static void p2(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
