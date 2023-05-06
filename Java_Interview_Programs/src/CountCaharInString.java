
public class CountCaharInString {

	public static void main(String[] args) {
		String s = "Java Programming Java oops";
		
		int totalCount = s.length();
		int totalCount_afterRemove = s.replaceAll("a","").length();
		int count = totalCount - totalCount_afterRemove;
		
		System.out.println("Number of occurances of 'a' is: " + count);
	}

}
