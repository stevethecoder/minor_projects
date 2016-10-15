package org.elevenfifty.work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	/*
	 * Create a new File reference to a file in your project folder Create a new
	 * FileOutputStream Write a string (such as "Hello, World!") to your file
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		try (FileWriter out = new FileWriter(file)) {
			out.write("Hello, World!\n");
		}
	}

}
