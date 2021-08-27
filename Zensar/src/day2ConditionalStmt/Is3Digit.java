package day2ConditionalStmt;
import java.util.Scanner;
public class Is3Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lno,fno,sum=0;
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		
		if(num >=100 && num <=999)
		{
			System.out.println(num+ " is 3 digit number");
		lno=num%10;	
		fno=num/100;
		sum= fno+lno;
		System.out.println("Sum of first and last digit is "+sum);
		
			
		}else
		{
			System.out.println(" This is not 3 digit number");
		}
	
		
	}

}
