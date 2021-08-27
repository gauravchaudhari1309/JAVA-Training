package Array2D;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= new int [3][3];
		System.out.println(arr.length); // rows length
		System.out.println(arr[0].length);// columns length
		
		Scanner sc= new Scanner(System.in);
		
		for(int r=0;r<arr.length;r++) 
		{
			
			System.out.println("Enter the element for row "+r );
		 	
			for(int c=0;c<arr[r].length;c++)
			{
				
				arr[r][c]=sc.nextInt();
			}
		}	
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++) 
			{
				System.out.print(arr[r][c] +" ");
			}
			System.out.println();
		}
	
	//Diagonal Array
	int d= arr.length-1;
		for(int r=0;r<arr.length;r++)
		{
			//System.out.println( arr[r][d--] + " ");
			for(int c=0;c<arr[r].length;c++) 
			{
				if(r+c==arr.length-1) 
				System.out.print(arr[r][c] +" ");
				else
					System.out.print(" ");
			}
			
			System.out.println();
			 
		}
	
	}

}
