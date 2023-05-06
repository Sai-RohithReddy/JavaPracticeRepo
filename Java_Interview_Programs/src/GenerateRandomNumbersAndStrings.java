import java.util.Random;

public class GenerateRandomNumbersAndStrings {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
		System.out.println(rand.nextDouble());
	}

}
