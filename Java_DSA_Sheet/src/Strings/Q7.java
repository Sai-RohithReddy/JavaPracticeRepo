package Strings;

import java.util.HashMap;
import java.util.Map;

public class Q7 {

	public static void main(String[] args) {
		Q7 q7 = new Q7();
		
		String str = "test string";
		
		q7.printDuplicates(str);
		
		System.out.println((char)(65));
		System.out.println((char)(91));
		
		q7.printDupEnhance(str);
	}
	public void printDuplicates(String str) {
		
		final int NoOfChar = 256;
		int[] count = new int[NoOfChar];
		
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for (int i = 0; i < NoOfChar; i++) {
			if (count[i] > 1) {
				System.out.println((char)(i) + ", count = " + count[i]);
			}
		}
	}

	public void printDupEnhance(String str) {
		
		HashMap <Character, Integer> count = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(!count.containsKey(str.charAt(i))) {
				count.put(str.charAt(i), 1);
			} else {
				count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
			}
		}
		
		for (Map.Entry mapElement : count.entrySet()) {
			char key = (char)mapElement.getKey();
			int val = ((int)mapElement.getValue());
			
			if (val > 1) {
				System.out.println(key +", count = " + val);
			}
		}
	}
}
