import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		String[] arr = {"Java", "C", "C++", "Python", "Java"};
		
		// Method 1
		
		/*
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element: " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate element not found");
		}
		*/
		
		// Method 2 - using HashSet
		
		HashSet<String> lang = new HashSet();
		
		boolean flag = false;
		for (String val : arr) {
			if (lang.add(val) == false) {
				System.out.println("Duplicate element found: " + val);
				flag = true;
			}			
		}
		if (flag == false) {
			System.out.println("Duplicate element not found");
		}
	}

}
