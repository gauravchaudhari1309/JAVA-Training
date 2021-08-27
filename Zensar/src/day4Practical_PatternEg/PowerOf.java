package day4Practical_PatternEg;

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		
		double result= Math.pow(base, index);		
		System.out.println("Power of given input is "+result);
		
	}

}
