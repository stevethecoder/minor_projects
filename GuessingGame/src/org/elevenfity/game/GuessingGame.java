package org.elevenfity.game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int r = (int) Math.ceil(Math.random() * 100);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Pick a number between 1 and 100 -->");

			int yourNumber = input.nextInt();

			if (yourNumber > r) {
				System.out.println("Number is lower");
			} else if (yourNumber < r) {
				System.out.println("Number is higher");
			} else {
				System.out.println("Good job! You got it.");
				System.out.println("You got it! The correct number is " + r);
				break;

			}
			if (i == 10) {
				System.out.println("You have completed available attempts. The correct number was " + r);
			} else {
				System.out.println("Keep trying");
			}

		}

	}

}
