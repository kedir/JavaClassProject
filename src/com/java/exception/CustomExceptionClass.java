package com.java.exception;

public class CustomExceptionClass {

	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product is invalid");
		}
	}

	public static void main(String[] args) {
		CustomExceptionClass obj = new CustomExceptionClass();
		try {
			obj.productCheck(60);
			System.out.println("product is valid");
		} catch (InvalidProductException e) {

			System.out.println("found an exception");
			System.out.println(e.getMessage());
		}

	}

}

class InvalidProductException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8404741365908786467L;

	InvalidProductException(String s) {
		super(s);

	}
}
