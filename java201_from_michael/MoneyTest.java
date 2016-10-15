package org.elevenfifty.java201;

import static java.lang.System.out;

import java.math.BigDecimal;

public class MoneyTest {

	public static void main(String[] args) {
		final BigDecimal money = new BigDecimal("12.34");

		out.println(money);

		BigDecimal withTax = money.multiply(new BigDecimal("1.32"));

		out.println(withTax);

		float f = 12.34f;
		f = f * 1.32f;
		out.println(f);

		showNullIssues("    Hi!    ");
		showNullIssues(null);
	}

	public static void showNullIssues(String s) {
		if (s != null)
			s = s.trim();
		out.println(s);
	}

}
