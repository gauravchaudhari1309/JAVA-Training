package day2ConditionalStmt;
import java.util.Scanner;
public class DivisibleBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		num=sc.nextLong();
		
		if(num%5==0 && num%11==0)
			System.out.println(num+" is divisible by 5 and 11");
		else
			System.out.println(num+" is not divisible by 5 and 11");
	}

}
