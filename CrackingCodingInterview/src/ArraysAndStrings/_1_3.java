package ArraysAndStrings;

public class _1_3 {

	public static void main(String[] args) {
		String str = "Mr John Smith  ";
		System.out.println(str);
		replaceSpaces(str.toCharArray(), str.length());
		
	}

	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index;
		
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') spaceCount++;
		}
		
		index = trueLength + spaceCount*2;
		char[] res = new char[index];
		
		if (trueLength < str.length) str[trueLength] = '\0';
		
		for (int i = trueLength -1; i >= 0; i--) {
			if (str[i] == ' ') {
				res[index -1] = '0';
				res[index -2] = '2';
				res[index -3] = '%';
				index -= 3;
			} else {
				res[index -1] = str[i];
				index--;
			}
		}
		System.out.println(res);
	}
}
