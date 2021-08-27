package day4Practical_PatternEg;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				sum+=i;
			
		}
		System.out.println("sum of 1 to"+n+" is "+sum);
	}

}
