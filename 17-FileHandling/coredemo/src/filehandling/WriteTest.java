package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	/* WriteTest methods
	 * a> FileWriter : to write file
	 * b> FileReader : to read file
	 */
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d://employee.txt", true);
		
		fw.write("ID : 999\n");
		fw.write("Name : Ram KC \n");
		fw.write("Age : 19 \n");
		fw.write("City : Jhapa \n");
		fw.write("Phone : 558844552\n");
		
		fw.close();
		System.out.println("Success");
	}
}
