
public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str = "Welcome To Java and Selenium";
		// Method 1
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for (String w : words) {
			String reverseword = "";
			for (int i = w.length()-1; i >= 0; i--) {
				reverseword = reverseword + w.charAt(i);
			}
			reverseString = reverseString + reverseword + " ";
		}
		System.out.println(reverseString);

		// Method 2
		String str1 = "Welcome To Java";
		String[] words1 = str1.split(" ");
		String reverseString1 = "";
		
		for (String w : words1) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseString1 = reverseString1 + sb.toString() + " ";
		}
		System.out.println(reverseString1);
	}

}
