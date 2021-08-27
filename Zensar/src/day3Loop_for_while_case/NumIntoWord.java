package day3Loop_for_while_case;
import java.util.Scanner;
public class NumIntoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no between 1 to 5");
		char digit= sc.next().charAt(0);
		
		switch(digit) {
		
		case '1':
	        System.out.println("One ");
	        break;
	 
	    
	    case '2':
	        System.out.println("Two ");
	        break;
	 
	     
	    case '3':
	        System.out.println("Three ");
	        break;
	 
	    
	    case '4':
	        System.out.println("Four ");
	        break;
	 
	    
	    case '5':
	        System.out.println("Five ");
	        break;
		
	        default:
	        	System.out.println("Invalid input");
		}
		sc.close();
	}

}
