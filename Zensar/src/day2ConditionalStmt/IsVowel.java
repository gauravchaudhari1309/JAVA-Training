package day2ConditionalStmt;

import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enrter any alphabet ");
		char ch=sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch+" is vowel");
        else
        	
            System.out.println(ch+" is consonant");
	}

}
