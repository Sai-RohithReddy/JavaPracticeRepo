package ArraysAndStrings;

import java.util.HashMap;

public class _1_1 {

	public static void main(String[] args) {
		
		String[] arr = {"Hello", "Demo", ""};
		
		for (String str : arr) {
			System.out.println(str + " - " + isUniqueString3(str));
		}
	}
	public static boolean isUniqueString1(String str) {
		
		int[] arr = new int[128];
		
		for (char c : str.toCharArray()) {
			if (arr[c] != 0) {
				return false;
			} else {
				arr[c]++;
			}
		}
		return true;
	}

	public static boolean isUniqueString2(String str) {
		
		if (str.length() > 128) return false;
		
		boolean[] arr = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			
			if (arr[val]) return false;
			
			arr[val] = true;
		}
		
		return true;
	}

	public static boolean isUniqueString3(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (char ch : str.toCharArray()) {
			if (map.get(ch) > 1) return false;
		}
		return true;
	}
}
