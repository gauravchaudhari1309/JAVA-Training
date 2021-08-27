package Array;
//WAP to print all negative elements in an array 
//also count total number of negative elements in an array.
import java.util.Scanner;

public class PrintNegativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the integer value");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<0) {
				System.out.println(arr[i]);
				count++;
				
			}
			
		}
		System.out.println("Count"+count);
		
	}

}
