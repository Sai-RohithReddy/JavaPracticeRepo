
public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		
		while (num > 0) {
//			int add = num % 10;
//			sum += add;
			sum = sum + num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
