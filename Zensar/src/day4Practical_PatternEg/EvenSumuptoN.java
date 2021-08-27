package day4Practical_PatternEg;
import java.util.Scanner;


public class EvenSumuptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the valu of n:");
		int n=sc.nextInt();
		for(int i=2; i<=n; i+=2)
		{	
			if(i%2==0)
				sum+=i;
			{
			System.out.println("Sum of 1 to "+n+" is " +sum);
			}
		}
		sc.close();
	}

}
