
package com.java.file.io;
import java.io.File;
import java.io.IOException;
//import java.io.OutputStream;
public class FileCopy {

	public static void main(String[] args) {
		File file = new File("output.txt");
		
		try {
			boolean fvar = file.createNewFile();
			if(fvar) {
				System.out.println("File has been created");
			}else {
				System.out.println("File not found");
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
		
	}
}
