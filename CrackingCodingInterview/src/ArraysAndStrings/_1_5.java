package ArraysAndStrings;

public class _1_5 {

	public static void main(String[] args) {
		_1_5 o = new _1_5();
		String[] s1 = {"pale", "pales", "pale", "pale"};
		String[] s2 = {"ple", "pale", "bale", "bae"};
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i] + ", " + s2[i] + " -> " + o.isOneEditAway(s1[i], s2[i]));
		}

	}
	public boolean isOneEditAway(String str1, String str2) {
		if (str1.length() == str2.length()) {
			return oneEditReplace(str1, str2);
		} else if(str1.length() + 1 == str2.length()) {
			return oneEditInsert(str1, str2);
		} else if (str1.length() - 1 == str2.length()){
			return oneEditInsert(str1, str2);
		}
		return false;
	}
	
	private boolean oneEditReplace(String str1, String str2) {
		boolean foundDifference = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}
	
	private boolean oneEditInsert(String str1, String str2) {
		int i1 = 0, i2 = 0;
		
		while (i1 < str1.length() && i2 < str2.length()) {
			if (str1.charAt(i1) != str2.charAt(i2)) {
				if (i1 != i2) {
					return false;
				} 
				i2++;
			} else {
				i1++; i2++;
			}
		}
		return true;
	}
}
