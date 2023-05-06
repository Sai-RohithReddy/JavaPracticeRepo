
public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String s = "Java   programming  ";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
