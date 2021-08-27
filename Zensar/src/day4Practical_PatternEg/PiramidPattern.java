package day4Practical_PatternEg;

import java.util.Scanner;

public class PiramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row level: ");
		int row=sc.nextInt();
		for(int i =1;i<=row;i++)
		{
			for(int j=1;j<=row-1;j--)
			{
				System.out.println("");
			}
				for( int j=1;j<=i;j++){
			
					  System.out.print("*");
				}
			
			
		}
		
		
		

	}

}
