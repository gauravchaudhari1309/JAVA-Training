package CustomArray_And_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter the "+size+" elements");
		for(int i=0;i<a.length;i++) 
		{
			
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);								//Ready made method for sorting the array.
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the search element");
		int search=sc.nextInt();
		
		int start=0,end=a.length-1;
		int found=0;
		while(start<end)
		{
			int mid=(start+end)/2;
			
			if(a[mid]==search)
			{
				System.out.println("Element found at "+mid+" position");
			found=1;
			break;
			}
			else if(search>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(found==0)
		{
			System.out.println("Element not found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
