package day4Practical_PatternEg;

import java.util.Scanner;

public class AutomorphicOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num=sc.nextInt();
		int i=0;
		int sq=num*num;
		int temp= num;
		while(temp>0)
		{
			i++;
			temp=temp/10;
						
		}
		double check=sq%(Math.pow(10,i));
		if(num==check)
			System.out.println(num+" is automorphic");
		else
			System.out.println(num+" is not automorphic");
	}

}