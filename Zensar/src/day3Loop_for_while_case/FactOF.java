package day3Loop_for_while_case;
//Factorail program5
import java.util.Scanner;

public class FactOF {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int f=1, n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no:");
			n= sc.nextInt();
			for(int i=1;i<=n;i++)
			
				f=f*i;
				System.out.println("Factorial is given no is :" +f);
			sc.close();
	}

}
