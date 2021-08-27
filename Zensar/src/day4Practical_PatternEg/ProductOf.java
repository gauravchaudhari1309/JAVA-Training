package day4Practical_PatternEg;

import java.util.Scanner;

public class ProductOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any no");
		int num =sc.nextInt();
		int product=1; 
        while (num != 0) {
            product = product * (num % 10);
            num = num / 10;
        }
		System.out.println("Digit product of given no is :"+product);
		
		
	}

}
