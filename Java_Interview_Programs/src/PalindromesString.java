import java.util.Scanner;

// Palindrome string = MADAM
public class PalindromesString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		
		String str = sc.next();
		String orgStr = str;
		
		String rev = "";
		
		int len = str.length();
		
		for (int i = len-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(orgStr.equals(rev)) {
			System.out.println(orgStr + " is Palindrome String");
		}
		else {
			System.out.println(orgStr + " is not Palindrome String");
		}

	}

}
