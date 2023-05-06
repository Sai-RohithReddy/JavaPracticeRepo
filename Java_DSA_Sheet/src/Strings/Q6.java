package Strings;

public class Q6 {

	public static void main(String[] args) {
		Q6 q6 = new Q6();
		
		String input = "GEEKSFO RGEEKS";
		
		System.out.println(q6.printSequence(input));

	}
	public String printSequence(String input) {
		int[] arr = {
				2, 22, 222, 
				3, 33, 333,
				4, 44, 444,
				5, 55, 555,
				6, 66, 666,
				7, 77, 777, 7777,
				8, 88, 888, 8888,
				9, 99, 999, 9999
		};
		
		String res = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') res = res + "0";
			else {
				res = res + arr[input.charAt(i) - 'A'];
			}
			
		}
		
		return res;
	}
}
