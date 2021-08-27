package Array;

import java.util.Scanner;

public class SearchIndexvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int[] ar= new int[5];
		System.out.println("Enter the element");
		
		for(int i=0;i<ar.length;i++) {
			
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the no that you want to show ");
		int search=sc.nextInt();
		
		for(int i=0; i<ar.length;i++) {
			
			if(ar[i]==search) {
				System.out.println("Given no is at index "+i);
			
			}
			
		}
		
	}
	}

