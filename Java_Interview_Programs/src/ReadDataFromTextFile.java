import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		// Method 1
		/*
		FileReader fr = new FileReader("C:\\Users\\Rohith Reddy\\Desktop\\py_practice\\Exercise-Files\\romeo.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while ((str = br.readLine()) != null){
			System.out.println(str);
		}
		br.close();
		*/
		
		// Method 2
		
		File file = new File("C:\\Users\\Rohith Reddy\\Desktop\\py_practice\\Exercise-Files\\romeo.txt");
		Scanner sc = new Scanner(file);
		
//		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		// Method 3
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

}
