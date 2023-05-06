package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

public class _1_2 {

	public static void main(String[] args) {
		String[] str = { "god", "dog", " god " };

		System.out.println(str[0] + " and " + str[1] + " are: " + isPermutationStirng4(str[0], str[1]));
		System.out.println(str[0] + " and " + str[2] + " are: " + isPermutationStirng4(str[0], str[2]));
		System.out.println(str[2] + " and " + str[1] + " are: " + isPermutationStirng4(str[2], str[1]));
	}

	public static boolean isPermutationStirng1(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		for (int i = 0; i < str1.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					flag = true;
				}
			}
			if (!flag)
				return false;
		}
		return true;
	}

	public static boolean isPermutationStirng2(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		return sort(str1).equals(sort(str2));
	}

	private static String sort(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String();
	}

	public static boolean isPermutationStirng3(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		int[] arr = new int[128];

		for (int i = 0; i < str1.length(); i++) {
//			int c = str1.charAt(i); arr[c]++;
			arr[(int) (str1.charAt(i))]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			arr[(int) str2.charAt(i)]--;
			if (arr[i] < 0)
				return false;
		}
		return true;
	}

	public static boolean isPermutationStirng4(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
//			System.out.println(map.get(c));
		}
		for (char c : str2.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) - 1);
//			System.out.println(map.get(c));
			if (map.get(c) < 0) {
				return false;
			}
		}

		return true;
	}
}
