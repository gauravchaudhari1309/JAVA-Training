//Write a program to find a Max between three numbers.	

package day2ConditionalStmt;
	import java.util.Scanner;				//import Scanner class
	public class MaxBetweenThree {
	
		public static void main(String[] args) {
			
			int n1, n2, n3;
			Scanner sc= new Scanner(System.in);		//taking input at runtime
			System.out.println("Enter the three nos:");
			
			n1= sc.nextInt();		//for integer data
			n2= sc.nextInt();
			n3= sc.nextInt();
			
			if (n1>n2 && n1>n3) 
			{
				System.out.println("Max number is "+n1);
			}else if (n2>n3) 
			{
				System.out.println("Max number is "+n2);
			}else 
				System.out.println("Max number is "+n3);
		}
	}
