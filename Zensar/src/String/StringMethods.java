package String;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s1 = "Chaudhari";
		String s2 = new String("chaudhari");

		String s3 = s1.toUpperCase();
		System.out.println(s3);
		String s4 = s2.toLowerCase();
		System.out.println(s4);

		char ch = s1.charAt(2);
		System.out.println(ch);

		char c = s2.charAt(s2.length() - 1);
		System.out.println(c);

		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println(s);

		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}

		int index = s1.indexOf('a'); // first occurrence of letter
		System.out.println("\n" + index);
		int index2 = s1.indexOf('a', index + 1); // check for next same occurrence of same letter
		System.out.println(index2);

		String substring = s2.substring(5);
		System.out.println(substring);

		String ss = s2.substring(3, 7);
		System.out.println(ss);

		CharSequence sq = s2.subSequence(3, 7);
		System.out.println(sq);

		System.out.println(s1.endsWith("das"));

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.startsWith("ch"));
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.compareTo(s2));
	}

}
