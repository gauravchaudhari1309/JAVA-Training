package day2ConditionalStmt;
import java.util.Scanner;
public class AlphaDigitChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Press any key:");
		char ch=sc.next().charAt(0);
		
		if ((ch>= 65 && ch <= 90)|| (ch>= 97 && ch<= 122))
		{
	            System.out.println(ch+" is Alphabet ");

		}else if (ch>= 48 && ch<= 57)
		{   
			System.out.println(ch+" is Digit ");
		}else
			System.out.println(ch+" is Special character");
		
	}

}
