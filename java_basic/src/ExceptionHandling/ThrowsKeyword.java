package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr = null;
		fr = new FileReader("C:\\Users\\Rohith Reddy\\Desktop\\python parh.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);

	}

}
/*
                un-checked     checked     methodLevel   withinTheMethod
Try..Catch         Y              Y           N                 N
throws             N              Y           Y                 N
*/