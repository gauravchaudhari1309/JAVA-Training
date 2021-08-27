package Array;

import java.util.Scanner;
//WAP to print reverse of an array. 
//Also print every alternate element backwards.
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 int arr[]= new int[5];
		System.out.println("Enter any 6 integer value");
		 for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();					//ip: 12345
		}
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]);				//54321
		}
		
		System.out.println();
		for(int i=arr.length-1;i>=0;i=i-2) {
			
		System.out.println(arr[i]);					//531
		}
		}
	}

