package day3Loop_for_while_case;

import java.util.Scanner;

//import sun.security.provider.JavaKeyStore.CaseExactJKS;

public class VowelUsingSwitch {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		char ch = x.next().charAt(0);

		switch (ch) {             
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("its a constant");
			break;

		}
		x.close();
	}

}
