package day28exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args)  {
		readTextFiles2();
	}
	public static void readTextFiles() throws IOException {
		FileInputStream fis =new FileInputStream("src/day28exceptions/TextFile01");	
	int i = 0;
	while((i=fis.read()) != -1) {
		System.out.print((char)i);
	}
	fis.close();
	}
	public static void readTextFiles2()  {
		FileInputStream fis=null;
		
		int i = 0;
		
		try {
			
			fis = new FileInputStream("src/day28exceptions/TextFile01");
			while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist or path is wrong");
			
		} catch (IOException e) {
			System.err.println("File cannot be read..." + e.getMessage());
		} finally {
			try {
				fis.close();
				System.out.println("\nconnection ended");
			} catch (Exception e) {
				System.err.println("File could not be closed maybe could not be accessed");
			}
		}


 	
	}
}
