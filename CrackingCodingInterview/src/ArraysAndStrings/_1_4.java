package ArraysAndStrings;

import java.util.HashMap;

public class _1_4 {
	public static void main(String[] args) {
		String str = "tact coa";
		System.out.println(isPermutationofPalindrome1(str));
		System.out.println(isPermutationofPalindrome2(str));
		System.out.println(isPermutationofPalindrome3 (str));
	}
	public static boolean isPermutationofPalindrome1(String str) {
		int[] table = buildCharFrequencyTable(str);
		return checkMaxOneOdd(table);
	}
	private static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int c : table) {
			if (c % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	private static int[] buildCharFrequencyTable(String str) {
//		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		int[] table = new int[25];
		for (char ch : str.toCharArray()) {
			int x = getCharNumber(ch);
			if (x != -1) table[x]++;
		}
		return table;
	}
	private static int getCharNumber(Character c) {
//		int a = Character.getNumericValue('a');
//		int z = Character.getNumericValue('z');
//		int val = Character.getNumericValue(c);
		int a = 'a', z = 'z', val = c;
		if (a <= val && val <= z) {
			return val - 'a';
		}		
		return -1;
	}

	public static boolean isPermutationofPalindrome2(String str) {
		int oddCount = 0;
		int[] table = new int[25];
		for (char c : str.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
				if (table[x] % 2 == 1) {
					oddCount++;
				} else {
					oddCount--;
				}
			}
		}
		return oddCount <= 1;
	}
	
	public static boolean isPermutationofPalindrome3(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		int oddCount = 0;
		for (char c : chars) {
			if (c >= 'a' && c <= 'z') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		for (char c : chars) {
			if (c >= 'a' && c <= 'z') {
				if (map.get(c) % 2 == 1) oddCount++;
			}
		}
		return oddCount <= 1;
	}
}
