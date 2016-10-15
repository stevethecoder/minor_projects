package org.elevenfifty.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Yo");

		try {
			System.out.write("Yo\n".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// File dir = new File("/home/mdowden/workspace/ElevenFiftyDay4");
		// File file = new File(dir, "strings.txt");
		File file = new File("strings.txt");
		FileOutputStream outFile = new FileOutputStream(file);
		String s;
		do {
			System.out.print("> ");
			s = input.nextLine();
			outFile.write(s.getBytes());
		} while (!"".equals(s));

		System.out.println("done.");
		System.out.println();

		File inputTxt = new File("input.txt");
		FileInputStream inFile = new FileInputStream(inputTxt);
		try (Scanner fileInput = new Scanner(inFile)) {
			while (fileInput.hasNextLine()) {
				System.out.println(fileInput.nextLine());
			}
		}

	}

}
