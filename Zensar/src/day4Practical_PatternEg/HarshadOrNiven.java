package day4Practical_PatternEg;

import java.util.Scanner;

public class HarshadOrNiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no :");
		int num=sc.nextInt();
		
		// int num = 156;  
	        int rem = 0, sum = 0, n;  
	          
	        n = num;  
	         
	        while(num > 0){  
	            rem = num%10;  
	            sum = sum + rem;  
	            num = num/10;  
	        } 
	          
	        if(n%sum == 0)  
	            System.out.println(n + " is a harshad number");  
	        else  
	            System.out.println(n + " is not a harshad number");  
	}

}
