package Strings;

public class Q1 {

	public static void main(String[] args) {

		Q1 q1 = new Q1();
		
		String s1 = "A man, a plan, a canal: Panama";
		String s = "0P";
		
		
		System.out.println(q1.isPalindrome(s));
		
	}
	public boolean isPalindrome(String s) {
		
		s= s.toLowerCase();
		String temp = "";
		
		int start = 0;
		int end = temp.length() - 1;
		
		for (int i = 0; i < s.length(); i++) {
			//if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 0 && s.charAt(i) <= 9) {
			if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
			temp = temp + s.charAt(i);
			}
		}

		//		for (int i = 0; i < end / 2; i++)
		while (start <= end) {
			if (temp.charAt(start) != temp.charAt(end)) return false;
			
			start++;
			end--;
		}
		return true;
	}
}
