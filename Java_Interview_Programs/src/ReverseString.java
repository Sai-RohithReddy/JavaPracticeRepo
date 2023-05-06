// 3 ways of reverse a string
public class ReverseString {

	public static void main(String[] args) {
		
		
		String str = "ABCD";
		String rev = "";
		
		// Method 1 - Using + (string concatenation) operator
		
		/*
		int len = str.length();
		
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		*/
		
		// Method 2 - Using character array
		
		/*
		char a[] = str.toCharArray();
		int len = a.length;
		
		for (int i = len-1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reversed string is: " + rev);
		*/
		
		// Method 3 - using String Buffer class
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		

	}

}
