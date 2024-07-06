package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d://employee.txt"); 
		BufferedReader br = new BufferedReader(fr);  // loading to cache memory
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			
			String[] data = line.split(",");
			
			System.out.println(data[1]);
			
			// try later
			// 1. db connection, 2. write sql (insert), 3. set values to sql, 4. execute sql
		}
	}
}
