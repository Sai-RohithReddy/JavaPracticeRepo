package ArraysAndStrings;

public class _1_9 {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isRotation(s1, s2));
		
		System.out.println(isRotation("java2blog", "avablog2j"));
	}
	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length() && s1.length() <= 0) return false;
		String s1s1 = s1 + s1;
		return s1s1.contains(s2);
	}
}
