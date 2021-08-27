package Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		int[] arr1= new int[8];					// syntax
		System.out.println("Enter any 8 integer");
		for(int i=0;i<=7;i++)
		{
			arr1[i] =sc.nextInt();		// accept array values
		}
		
		 for(int i=0;i<=7;i++) { 
			 System.out.println(arr1[i]); //display array values }
		}
		 
		for (int i=7;i>=0;i--)				//print in reverse order 
		{
			System.out.println(arr1[i]);
		}
	}
	
}

