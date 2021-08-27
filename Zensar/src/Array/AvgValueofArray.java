package Array;

import java.util.Scanner;

public class AvgValueofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	int[] arr = new int[5];
	System.out.println("Enter any 5 integer");
	for(int  i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int sum=0;
	double avg=0;
	for(int  i=0; i<arr.length;i++)
	{
		sum= sum+arr[i];
		avg= sum/arr.length;
		
	}
	System.out.println("Avg of given array is "+avg);
	}
}