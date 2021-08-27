package CustomArray_And_Sort;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,1,2,3,4,5,0};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the search element : ");
		int search=sc.nextInt();
		int found=1;
		for(int i=0;i<array.length;i++)
		{
			if(search==array[i]) {
				
				found=0;
				System.out.println("Element found at "+i+" position");
			}

		}
		if(found==1)
			System.out.println("Element Not Found");
		
	}

}
