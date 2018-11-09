package com.java.file.io;

class JavaException {
	   public static void main(String args[]){
	      int d = 0;
	      int n = 20;
	      try {
		      int fraction = n/d;
		      System.out.println("This line will not be Executed");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("In the catch Block due to Exception ="+e);
		}finally {
			System.out.println("Inside the final block");
		}
	      
	      
	      
	      
	     System.out.println("End Of Main");
	   }
	}

