package day2ConditionalStmt;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1no:");
		double fno=sc.nextDouble();
		System.out.println("Enter the 2no:");
		double sno=sc.nextDouble();
		System.out.println("Enter the operator(*,/,+,-):");
		char sign=sc.next().charAt(0);
		
		if(sign=='+') {
			ans=fno+sno;
		System.out.println(fno+ "+" +sno+ "=" +ans );
		}else if(sign=='-') {
			ans=fno-sno;
		System.out.println(fno+ "-" +sno+ "=" +ans );
		}else if(sign=='*') {
			ans=fno*sno;
		System.out.println(fno+ "*" +sno+ "=" +ans );
		}else if(sign=='/') {
			ans=fno/sno;
		System.out.println(fno+ "/" +sno+ "=" +ans );
		}else
			System.out.println("Your input is wrong");
	sc.close();
	}

}
