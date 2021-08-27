package day3Loop_for_while_case;

import java.util.Scanner;

public class TableOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no which table you want to print:");
		a=sc.nextInt();
		for (int i=1;i<=10;i++)
		System.out.println(a*i);
		
		sc.close();
	}
         
}
