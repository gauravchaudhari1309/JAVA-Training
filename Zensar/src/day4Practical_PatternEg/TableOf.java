package day4Practical_PatternEg;

import java.util.Scanner;

public class TableOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no: ");
		int number=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int table=number*i;
			System.out.println(table);
		}
		
}
}