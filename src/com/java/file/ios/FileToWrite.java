package com.java.file.ios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToWrite {

	public static void main(String[] args) throws IOException {

		tryWithResource();
     	readFile();
		readWithResource();

		String content = "Hello to java file IO";
		File file = new File("Data.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();

	}

	public static void tryWithResource() {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Demo.txt"))) {

			String str = "this is try with resource";
			bw.write(str);
			bw.newLine();
			bw.write(str);
			bw.close();
		} catch (Exception e) {
			System.out.println("File IO exceptions not found Demo.txt file");
		}

	}

	public static void readFile() {

		BufferedReader bufferedReader = null;

		try {
			String currentLine;
			bufferedReader = new BufferedReader(new FileReader("Demo.txt"));
			while ((currentLine = bufferedReader.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (Exception e) {
			System.out.println("exceptions");
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();

			} catch (Exception e2) {
				System.out.println("file reader error");
			}
		}

	}
	
	public static void readWithResource() throws IOException {
		try(BufferedReader bw = new BufferedReader(new FileReader("Demo.txt"))){
			
		}catch(FileNotFoundException e){
			
		}
		
	}

}
