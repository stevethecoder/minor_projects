package org.elevenfifty.java201;

import static java.lang.System.out;

public class LoopExamples {

	public static void main(String[] args) {

		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

		out.println("for loop");
		for (int i = 0; i < a.length; i++) {
			char x = a[i];
			out.println(x);
		}

		out.println("for each");
		for (char x : a) {
			out.println(x);
		}

		out.println("while");
		int j = 0;
		while (j < a.length) {
			out.println(a[j++]);
		}

		out.println("do while");
		int k = 0;
		do {
			out.println(a[k++]);
		} while (k < a.length);

		while (true) {
			out.println("running");
			if (Math.random() * 100 > 50) {
				break;
			}
		}
		out.println("done");

		double r;
		do {
			out.println("running");
			r = Math.random() * 100;
		} while (r <= 50);
		out.println("r = " + r);

		// X O X
		// O X O
		// O X X
		char[][] tictactoe = new char[][] { 
			{ 'X', 'O', 'X' }, 
			{ 'O', 'X', 'O', 'T' }, 
			{ 'O', 'X', 'X' } 
		};
/*		for(int i = 0; i < tictactoe.length; i++) {
			char[] row = tictactoe[i];
			for(int ii = 0; ii < row.length; ii++) {
				char x = row[ii];
				System.out.print(x);
				System.out.print(' ');
			}
			System.out.println();
		}*/
		for(char[] row : tictactoe) {
			for(char x : row) {
				System.out.print(x);
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}

}
