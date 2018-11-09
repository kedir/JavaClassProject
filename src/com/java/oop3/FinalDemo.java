package com.java.oop3;

public  final class FinalDemo {
	
	final int max_value = 99;
	
	//Final method can not be override 
	final void fDemo(final String str) {
		System.out.println("this is final method");
	}
	
  void myMehthod() {
	  
  }
  public static void main(String[] args) {
	FinalDemo obj = new FinalDemo();
		obj.myMehthod();
		
}
  
  /*
    1) A constructor cannot be declared as final.
	2) Local final variable must be initializing during declaration.
	3) All variables declared in an interface are by default final.
	4) We cannot change the value of a final variable.
	5) A final method cannot be overridden.
	6) A final class not be inherited.
	7) If method parameters are declared final then the value of these parameters cannot be changed.
   */

}
