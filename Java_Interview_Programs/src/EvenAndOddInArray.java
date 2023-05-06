
public class EvenAndOddInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Even Numbers..");
		for (int val : arr) {
			if (val % 2 == 0) {
				System.out.println(val);
			}
		}

		System.out.println("Odd Numbers..");
		for (int val : arr) {
			if (val % 2 != 0)
				System.out.println(val);
		}
	}

}
