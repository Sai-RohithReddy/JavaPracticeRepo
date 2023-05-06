package ArraysAndStrings;

public class _1_6 {

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		String res = compressStr3(str);
		System.out.println(res);
//		System.out.println(countCompression(str));

	}
	public static String compressStr1(String str) {
		String compressedStr = "";
		int charCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			charCount++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedStr += "" + str.charAt(i) + charCount;
				charCount = 0;
			}
		}
		return compressedStr.length() < str.length() ? compressedStr : str;
	}

	public static String compressStr2(String str) {
		StringBuilder compressStr = new StringBuilder();
		int charCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			charCount++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressStr.append(str.charAt(i));
				compressStr.append(charCount);
				charCount = 0;
			}
		}
		return compressStr.length() < str.length() ? compressStr.toString() : str;
	}

	public static String compressStr3(String str) {
		int finalLength = countCompression(str);
		int currentCount = 0;
		if (finalLength >= str.length()) return str;
		
		StringBuilder compressed = new StringBuilder(finalLength);
		
		for (int i = 0; i < str.length(); i++) {
			currentCount++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(currentCount);
				currentCount = 0;
			}
		}
		return compressed.toString();
	}
	
	private static int countCompression(String str) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}
}
