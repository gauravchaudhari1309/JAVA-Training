package Excepton_e;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner dc= new Scanner(System.in);
			
			try {
				
				System.out.println("Enter the no");
				int d=dc.nextInt();
				System.out.println("Sq"+ d*d);
				System.out.println("try ends");
				System.out.println("Enter the name:");
				String nm=dc.next();
				System.out.println(nm.charAt(3));
				
			}catch(Exception e){
				
				System.out.println("Invalid ip");
			}
}
}