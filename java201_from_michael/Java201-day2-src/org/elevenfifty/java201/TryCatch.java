package org.elevenfifty.java201;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryCatch {

	public static void main(String[] args) {
		TryCatch test = new TryCatch();
		
		int a = 14;
		int b = 0;
		
		if(a != 0 && b != 0) {
			print( test.divide(a, b));
		} else {
			print("Don't divide by zero!");
		}
		
		String s = null;
		
		try {
			s.equals("Foo");
		} catch(NullPointerException e) {
			print("NPE");
		}
		
		
		try {
			print( test.divide(4, 2) );
			print( test.divide(14, 0) );
		} catch(ArithmeticException e) {
			print("Don't divide by zero!");
		} catch(Exception e) {
			print("Something bad happened: " + e.getMessage());
		} finally {
			print("All Done");
		}
		
		try {
			test.printHelloWorld();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			print( test.divide(4, 2) );
		} finally {
			print("Yup");
		}
		

	}
	
	public int divide(int a, int b) {
		if(a > 10) {
			throw new IllegalArgumentException("Too Big");
		}
		
		return a / b;
	}
	
	public void printHelloWorld() throws IOException {
		try(InputStream in = new ByteArrayInputStream("Hello, World!".getBytes())) {
			while(in.available() > 0) {
				System.out.print((char)in.read());
				//print((char)in.read());
			}
			print("");
		}
	}

	public static void print(Object o) {
		System.out.println(o.toString());
	}
	
}
