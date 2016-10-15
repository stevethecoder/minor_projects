package org.elevenfifty.work;

public class Strings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = ", ";
		String c = "World!";

		System.out.println(a + b + c);

		System.out.println("Hello" + ", " + "World!");

		String hw = "Hello, World!";
		System.out.println(hw.charAt(5));

		System.out.println(hw.substring(7, 12));
		String phone = "+1 (317) 455-6550";
		System.out.println(phone.substring(phone.indexOf('(') + 1, phone.indexOf(')')));

		String email = "michael@dowden.us";
		System.out.println(email.substring(email.indexOf('@') + 1));

		StringBuilder bld = new StringBuilder();
		bld.append("Hello").append(b).append(c);
		System.out.println(bld);

		System.out.println(
			new StringBuilder().append(a).append(b).append(c)
				);
		
		String s = new StringBuilder().append(a)
				.append(b).append(c).toString();
		System.out.println(s);
		
		s.concat("foo");
		StringBuffer buf = new StringBuffer();
		buf.append(a).append(b).append(c);
		System.out.println(buf.toString());
	}

}
