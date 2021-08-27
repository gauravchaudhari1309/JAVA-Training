package day4Practical_PatternEg;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any No:");
		long number=s.nextLong();
		long count = 0;
        while (number != 0) {
            number/=10;
            ++count;
        }
	System.out.println("Given no is "+count+" digit number");
	}

}
