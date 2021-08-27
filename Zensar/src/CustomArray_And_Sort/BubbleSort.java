package CustomArray_And_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {13,9,97,40,3,-23,0};
		
		Scanner sc= new Scanner(System.in);
		for(int j=0;j<a.length-1;j++) {
			
		
		for(int i=0;i<a.length-1;i++) {
		
			if(a[i]>a[i+1]) {
				
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
			
		}
			System.out.println(Arrays.toString(a));
		}
	}

}
