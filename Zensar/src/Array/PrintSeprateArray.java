package Array;

import java.util.Scanner;

public class PrintSeprateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n;     //Declare array size
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        
        int arr[]=new int[n];   //Declare array 
        System.out.println("Enter the array");  
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int eve=0,od=0;    //Declare the size of the array for even and odd elements
        for(int i=0;i<n;i++)   
        {
            if(arr[i]%2==0)
             eve++;    //Increment even array size
             else 
             od++;   //Increment odd array size
        }
        int even[]=new int[eve];    //Declare an even array
        int odd[]=new int[od]; 
        
        int k=0,t=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
              even[k]=arr[i];   //Initialize elements of even array
              k++;
            }
            else
            {
                odd[t]=arr[i];  //Initialize elements of odd array
                t++;
            }
        }
        System.out.println("The array with even elements...");
        for(int i=0;i<eve;i++)
        {
            System.out.print(even[i]+" ");   //Print Even Array
        }
        System.out.println("");
        System.out.println("The array with odd elements...");
        for(int i=0;i<od;i++)
        {
            System.out.print(odd[i]+" ");    //Print Odd Array
        }
	}

}
