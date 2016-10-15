package UserInputTally;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class FileFinding {

	public static void main(String[] args) {

		File outputfile = new File("output.txt");
		try (FileWriter out = new FileWriter("outputFile")) {
			System.out.print("Hello World");
		}
	}

	File inputTxt = new File("input.txt");
	FileInputStream inFile = new FileInputStream(inputTxt);
		try (Scanner fileInput = new Scanner(inFile)) {
	}
		while (fileInput.hasNextLine()){
			System.out.println(fileInput.nextLine());
	}
		
}

}
