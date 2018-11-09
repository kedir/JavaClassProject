package com.java.file.io;
class JavaException1{
	 public static void main(String args[]){
	  try{
	       throw new MyException(2);
	       // throw is used to create a new exception and throw it.
	  }
	 catch(MyException e){
	    System.out.println(e) ;
	 }
	}
	}
	class MyException extends Exception{
	   /**
		 * 
		 */
		//private static final long serialVersionUID = 1L;
	int a;
	   MyException(int b) {
	     a=b;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	}