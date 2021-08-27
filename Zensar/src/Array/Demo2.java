package Array;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob=  new Scanner(System.in);
		
		int[] arr2= new int[8];		
		System.out.println("Enter the array values");
		for(int i=0;i<=4;i++)
		{
			arr2[i]=ob.nextInt();		
		}
		for(int i=0;i<=4;i++) {
			
			System.out.println(arr2[i]);
		}
		for(int i=0;i<=4;i=i+2) {
			
			System.out.println(arr2[i]);
		}
		
	}

}
