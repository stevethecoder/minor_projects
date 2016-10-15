package org.elevenfifty.java201;

import static java.lang.System.out;

public class Factorial {

	public static void main(String[] args) {
		int num = Integer.valueOf(args[0]);
		long total = calculateFactorial(num);
		System.out.println(total);

		System.out.println("Numbers 1-100 Divisible by 3 or 5:");
		System.out.println(calculateSumOf3sAnd5s());

		printFibonacci50();
	}

	// 12! = 12 x 11 x 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1 = 479001600
	private static long calculateFactorial(int targetNumber) {
		int counter = 1;
		long total = 1;
		do {
			total *= counter;
			counter++;
		} while (counter <= targetNumber);

		return total;
	}

	public static long calculateSumOf3sAnd5s() {
		long total = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				total += i;
		}
		return total;
	}

	public static void printFibonacci50() {
		long first = 0;
		out.println("1: " + first);
		long second = 1;
		out.println("2: " + second);
		for (int i = 3; i <= 50; i++) {
			long next = first + second;
			out.println(i + ": " + next);
			first = second;
			second = next;
		}
	}

}
