package array.string;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s1 = in.next();
		String s2 = in.next();
		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.concat(s2));
		String s = "    java    ";
		System.out.println(s.trim());

		System.out.println(s1.contains("wel"));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.replace('a', 't'));
		System.out.println(s1.substring(1, 5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

	}

}
