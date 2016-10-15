package org.elevenfifty.java201;

import static java.lang.System.out;

public class OperatorExamples {

	public static void main(String[] args) {

		if (true)
			out.println("True");

		if (false)
			out.println("False");

		if (!false)
			out.println("NOT False");

		if (!true)
			out.println("NOT True");

		if (true && false)
			out.println("True AND False");

		if (true || false)
			out.println("True OR False");

		if (true || true)
			out.println("True OR True");

		if (6 <= 16)
			out.println("6");

		if (7 >= 1)
			out.println("7");

		if (6 != 5)
			out.println("6 <> 5");

		int a = 4;
		int b = a * 2;
		int c = a / 4;
		int d = b - c;
		int e = 5 % 2;

		out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e);

		int f = 0;
		f += 3; // f = f + 3
		f *= 2; // f = f * 2
		f -= 1; // f = f - 1
		f /= 5; // f = f / 5

		out.println("f= " + f);

		int g = 0;
		out.println("G:");
		out.println(g);
		out.println(g++);
		out.println(g);
		out.println(++g);
		out.println(g);
		out.println(g--);
		out.println(g);
		out.println(--g);
		out.println(g);

		int h = 2 * 3 + 6 / 3 - 1;
		out.println("h = " + h);

		int i = h == 7 ? 13 : 11;
		out.println("i = " + i);

		Integer o = null;
		int j = o == null ? 1 : o.intValue();
		out.println("j = " + j);

		int r = (int) Math.ceil(Math.random() * 10);
		if (r == 10) {
			out.println("You Win!");
		} else if (r > 5) {
			out.println("Hot Stuff");
		} else if (r > 0) {
			out.println("Not good");
		} else {
			out.println("You suck");
		}

		switch (r) {
		case 10:
			out.println("You Win!");
			break;
		case 9:
			out.println("Hot Stuff");
			break;
		case 8:
			out.println("Hot Stuff");
			break;
		case 7:
			out.println("Hot Stuff");
			break;
		case 6:
			out.println("Hot Stuff");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			out.println("Not good");
			break;
		default:
			out.println("You suck");
		}

	}

}
