
public class Pattern5 {

	public static void main(String[] args) {
		p5(5);
	}
	static void p5(int n) {
	int c = n - 1;
	for (int i = 0; i < n; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" ");
			}
			c--;
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
