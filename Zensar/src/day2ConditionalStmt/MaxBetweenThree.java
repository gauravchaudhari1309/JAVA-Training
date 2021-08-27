package day2ConditionalStmt;
import java.util.Scanner;
public class MaxBetweenThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three nos:");
		
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("Max number is "+n1);
		}else if (n2>n3) {
			System.out.println("Max number is "+n2);
		}else 
			System.out.println("Max number is "+n3);
		
	}

}
