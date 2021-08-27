package day4Practical_PatternEg;

import java.util.Scanner;

public class FactSeriesOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in) ;

		System.out.println("Enter limit") ;

		int number=sc.nextInt() ;
		int sum=0;
		for(int i=1;i<=number ;i++) {
			int fact=1;
		for(int j=1;j<=i; j++) {
		fact=fact*j;
		}
		sum=sum+fact;
		}
		System.out.println("Sum of series is "+sum) ;
		}

		
	}


