package day2ConditionalStmt;
//positive negative using conditional program
import java.util.Scanner;

public class PositiveNegativeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numberber :");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println(number + " is Positive ");
		} else if (number < 0) {
			System.out.println(number + " is Negative ");

		} else
			System.out.println("You entered Zero");
		sc.close();
	}

}
