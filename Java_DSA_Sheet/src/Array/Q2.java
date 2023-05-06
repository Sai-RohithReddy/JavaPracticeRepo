package Array;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {

		Q2 q2 = new Q2();
		
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));
		
		q2.reverseNum(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------------");
		
		String str = "hello";
		System.out.println(str);
		
		String res = q2.reverseStr(str);
		System.out.println(res);
	}
	public void reverseNum(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}

	public String reverseStr(String word) {
		
		char[] wordArr = word.toCharArray();
		
		String res;
		
		int start = 0;
		int end = wordArr.length - 1;
		
		while (start < end) {
			char temp = wordArr[start];
			wordArr[start] = wordArr[end];
			wordArr[end] = temp;
			
			start++;
			end--;
		}
		
		return res = String.copyValueOf(wordArr);
	}
}