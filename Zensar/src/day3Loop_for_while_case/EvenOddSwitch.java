package day3Loop_for_while_case;
import java.util.Scanner;
public class EvenOddSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
		 
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter an Integer");
	        num = in.nextInt();
	        switch(num%2) {
	            case 0:
	                    System.out.println(num+ " is EVEN Number");
	                    break;
	            case 1:
	                    System.out.println(num+ " is ODD Number");
	        }
	        in.close();
	        }

}
