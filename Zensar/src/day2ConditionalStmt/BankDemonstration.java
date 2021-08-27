package day2ConditionalStmt;
import java.util.Scanner;
public class BankDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int a= sc.nextInt();
		
		int n= a/2000;
		a=a%2000;
		int n1=a/500;
		a=a%500;
		int n2=a/50;
		a=a%50;
		int n3=a/10;
		a=a%10;
		int n4=a/1;
		System.out.println("2000 =" + n +"\n500="+n1+"\n50="+n2+"\n10="+n3+"\n1="+n4 );
		
	}

}
