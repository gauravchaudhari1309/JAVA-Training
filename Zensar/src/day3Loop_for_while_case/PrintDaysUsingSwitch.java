package day3Loop_for_while_case;
import java.util.Scanner;
public class PrintDaysUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		switch(num){
		case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	        System.out.println("31 Days.");
	        break;
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	        System.out.println("30 Days.");
	        break;
	    case 2:
	         System.out.println("28/29 Days.");
	        break;
	  
	    default:
	        System.out.println("Invalid Month.");
	        break;
		}
	sc.close();
	}

}
