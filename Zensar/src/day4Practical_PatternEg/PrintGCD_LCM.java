package day4Practical_PatternEg;

import java.util.Scanner;


public class PrintGCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  t, aTemp, bTemp, lcm, gcd;
	        
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter Two Number");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        
	        aTemp = a;
	        bTemp = b;
	 
	        while (bTemp != 0) {
	            t = bTemp;
	            bTemp = aTemp % bTemp;
	            aTemp = t;
	        }
	 
	        gcd = aTemp;
	        
	        lcm = (a * b) / gcd;
	        System.out.println("LCM = " + lcm);
	        System.out.println("GCD = " + gcd);
	}

}
