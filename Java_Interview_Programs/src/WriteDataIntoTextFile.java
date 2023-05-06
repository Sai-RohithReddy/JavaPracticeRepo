import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\Rohith Reddy\\Desktop\\py_practice\\Exercise-Files\\javaFileWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with Java\n");
		bw.write("Selenium with Python\n");
		bw.write("Selenium with C#");
		
		System.out.println("Finished!!");
		bw.close();
	}

}
