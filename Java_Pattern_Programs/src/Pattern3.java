
public class Pattern3 {

	public static void main(String[] args) {
		p3(5);
	}
	static void p3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
