package com.java.file.ios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFileImage {
	static byte[] bytes;
	
	public static void main(String[] args) {
		String imageName = "src/com/java/file/io/java.png";
		readFileIntoArray(imageName);
		String newImage = "src/com/java/file/io/newJava.png";
		writeArrayToFile(newImage);
		
	}

	static void readFileIntoArray(String fn) {
		File f = new File(fn);
		long length = f.length();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);
			int intLength = (int) length;
			bytes = new byte[intLength];
			fis.read(bytes);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}

	}

	static void writeArrayToFile(String fn) {
		File f = new File(fn);
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(f);
			fos.write(bytes);
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.err.println(e);
			}
		}

	}
}