package day2ConditionalStmt;
import java.util.Scanner;
public class IsLeapYear {

	public static void main(String[] args)
	{
		int year;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year");
		year=sc.nextInt();
		
		if(year%4==0)
			System.out.println(year+" This is leap year");
		else
			System.out.println(year+" This is not a leap year");
		sc.close();
	}
}
