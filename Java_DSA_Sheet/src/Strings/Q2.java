package Strings;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		Q2 q2 = new Q2();
		
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println(q2.isAnagram1(s, t));
	}
	public boolean isAnagram1(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		int[] temp = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			temp[s.charAt(i) - 'a']++;
			temp[t.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (temp[i] != 0) return false;
		}
		return true;
	}
	
	public boolean isAnagram2(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		int[] temp = new int[26];
		
		for (char c : s.toCharArray()) {
			temp[c - 'a']++;
		}
		
		for (char c : t.toCharArray()) {
			if (temp[c - 'a'] == 0) return false;
			temp[c - 'a']--;
		}
		
		return true;
	}
	
	public boolean isAnagram3(String s, String t) {
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
		
	}
}
