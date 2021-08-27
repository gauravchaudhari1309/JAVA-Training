package day3Loop_for_while_case;
import java.util.Scanner;
//all digit sum  program
public class DigitSum {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			sum=sum + i%10;
			System.out.println(sum);
		}
	}

}
