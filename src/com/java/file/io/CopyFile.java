package com.java.file.io;
import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
     // FileInputStream in = null;
     // FileOutputStream out = null;
      FileReader in1=null;
      FileWriter out1=null;

      try {
        // in = new FileInputStream("input.txt");
        // out = new FileOutputStream("output.txt");
         in1 = new FileReader("input.txt");
         out1=new FileWriter("output.txt");
         
         int c;
         while ((c = in1.read()) != -1) {
        	 //System.out.println(c);
            out1.write(c);
         }
      }finally {
         if (in1 != null) {
            in1.close();
         }
         if (out1 != null) {
            out1.close();
         }
      }
   }
}