package Loops;

public class AdvancedLooping {

	public static void main(String[] args) {
//		for (int i = 1, j = 1; i <= 10 && j <= 10; i++, j++) {
//			System.out.println("i="+i+" And j="+j);
//		}

//		for (int i = 1, j = 1; i <= 10 || j <= 10; i++, j++) {
//			j++;
//			System.out.println("i="+i+" And j="+j);
//		}

//		for (int i = 1, j = 1; i <= 10 && j <= 10; i++, j++) {
//			j++;
//			System.out.println("i=" + i + " And j=" + j);
//		}

//		int i = 1, j = 1;
//		while (i <= 10 && j <= 10) {
//			System.out.println("i=" + i + " And j=" + j);
//			i++;
//			j++;
//		}
		
		int i = 1, j = 1;
		do {
			System.out.println("i=" + i + " And j=" + j);
			i++;
			j++;
		} while (i <= 10 && j <= 10);

	}

}