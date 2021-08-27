package day2ConditionalStmt;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The values of P,T,R" );
		double p=sc.nextDouble();
		double t=sc.nextDouble();
		double r=sc.nextDouble();
		
		System.out.println("Simple Intrest ="+ (p*t*r/100));
		sc.close();
	}

}
