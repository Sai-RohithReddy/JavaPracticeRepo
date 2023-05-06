package Strings;

public class Q5 {

	public static void main(String[] args) {

		Q5 q5 = new Q5();
		
		String[] str = {"flower","flow","flight"};
		
		String res = q5.longestCommonPrefix(str);
		System.out.println(res);
	}
	
	public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
        	String curWrd = strs[i];
        	int j = 0;
        	while(j < res.length() && j < curWrd.length() && curWrd.charAt(j) == res.charAt(j)) {
        		j++;
        	}
        	if (j == 0) return "";
        	
        	res = res.substring(0, j);
        }
        return res;
    }
}
