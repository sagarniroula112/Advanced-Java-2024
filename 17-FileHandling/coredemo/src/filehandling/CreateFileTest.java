package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileTest {
	/*
	 * a> FileOutputStream :: file write
	 * b> FileInputStream :: file read
	 */
	
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("d://hello.txt");
		// converts the string into a sequence of bytes using the platform's default character encoding.
		
		file.write("Good evening".getBytes());
		
		file.close();
		System.out.println("Success");
	}
}
