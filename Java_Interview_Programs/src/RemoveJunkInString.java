
public class RemoveJunkInString {

	public static void main(String[] args) {

		String s = "$%^$#$%^&&^$#  latin string 012345667";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
