package day4Practical_PatternEg;

import java.util.Scanner;

public class KrishnammurtyOrNot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the no : ");
		n=sc.nextInt();
		for(int i=n;i>0;i=i/10)
		{
			int digit= i%10;
			int f=1;
			for(int j=1;j<=digit;j++) {
				f=f*j;
							
			}
			sum=sum+f;
				
		}
		if(sum==n)
			System.out.println("Its Krishnamurty");
		else
			System.out.println("Its not a Krishnamurty");
	}
	
}