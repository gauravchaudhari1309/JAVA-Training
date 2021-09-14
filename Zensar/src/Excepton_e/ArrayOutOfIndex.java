package Excepton_e;

import java.util.Scanner;

public class ArrayOutOfIndex {

	public static void main(String args[]) throws ArrayIndexOutOfBoundsException
			{
			
				Scanner s = new Scanner(System.in);

				int arr[] = new int[5];

				// Try block to check exception
				try {
					
					for (int i = 0; i < 6; i++) {

						arr[i] = s.nextInt();
					}
				}
				catch (ArrayIndexOutOfBoundsException e) {
					//  when any exception occurs
					System.out.println(
						"Array Bounds Exceeded...");
				}
				
s.close();		
	}

}
