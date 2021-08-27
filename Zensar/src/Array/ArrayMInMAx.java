package Array;

import java.util.Scanner;

public class ArrayMInMAx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size= sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter "+arr.length+" elements");
		
		
		for(int  i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	
		}
		int min=arr[0];
		for( int i=1;i<arr.length;i++)
		{
			if  (min>arr[i])
				min= arr[i];
		}
		int max=arr[0];
		for( int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Minimum no is "+min);
		System.out.println("Maximum no is "+max);
	}

}
