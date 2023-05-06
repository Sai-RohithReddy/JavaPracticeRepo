package java_basic;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "to java";
		
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		
		s1 = "     welcome    ";
		System.out.println(s1);
		System.out.println(s1.trim());
		
		s1 = "Welcome";
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.contains("Welcome"));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains("lco"));
		
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("welcome"));
		
		System.out.println(s1.replace("e", "o"));
		System.out.println(s2.replace("java", "python"));
		System.out.println(s1);
		
		System.out.println(s1.substring(1,4));//starting index starts from ->0, ending indes starts from ->1
	
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
}
