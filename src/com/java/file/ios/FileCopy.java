package com.java.file.ios;

import java.io.File;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
		
		File file = new File("Data.txt");
		
		try {
			 boolean fvar = file.createNewFile();
			 
			 if (fvar) {
				 System.out.println("File has been created");
			 }else {
				 System.out.println("File not found");
			 }
			 
		} catch (IOException e) {
			System.out.println("IO exceptions");
			
		}
		
		
		
	}
	

}
