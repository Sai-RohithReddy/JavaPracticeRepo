public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int r = c.length - 1;

        while (l < r) {
            if (c[l] != c[r]) return false;
            l++;
            r--;
        }
        return true;
    } 
}
