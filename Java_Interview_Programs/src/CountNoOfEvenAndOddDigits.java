
public class CountNoOfEvenAndOddDigits {

	public static void main(String[] args) {
		int num = 145678;
		int even = 0, odd = 0;
		
		while (num > 0) {
			int check = num % 10;
			if (check % 2 == 0) {
				even ++;
			}
			else {
				odd ++;
			}
			num /= 10;
		}
		System.out.println("Even Digits: " + even + " Odd Digits: " + odd);

	}

}
