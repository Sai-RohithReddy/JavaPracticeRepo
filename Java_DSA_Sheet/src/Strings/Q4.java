package Strings;

public class Q4 {

	public static void main(String[] args) {

		Q4 q4 = new Q4();
		String s1 = "aabaa";
		String s2 = "aabb";
		
		System.out.println(q4.removeConsecutiveCharacter(s1));
		System.out.println(q4.removeConsecutiveCharacter(s2));
	}
	public String removeConsecutiveCharacter(String s){
        String temp = "";
        
        for (int i = 0; i < s.length(); i++) {
        	if (i < s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
        		continue;
        	} else {
        		temp = temp + s.charAt(i);
        	}
        }
        return temp;
    } 
}
