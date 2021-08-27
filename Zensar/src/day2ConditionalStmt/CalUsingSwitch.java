package day2ConditionalStmt;
import java.util.Scanner;
public class CalUsingSwitch {

	public static void main(String[] args) {
		int ans;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1no:");
		int fno =sc.nextInt();
		System.out.println("Enter 2no:");
		int sno =sc.nextInt();
		System.out.println("Enter the operation:");
		int op=sc.next().charAt(0);
		
		switch(op) {
		
		case'+':
			ans= fno+sno;
			System.out.println(fno+"+"+sno+"="+ans);
			break;
		case'-':
			ans= fno-sno;
			System.out.println(fno+"-"+sno+"="+ans);
			break;
		case'*':
			ans= fno*sno;
			System.out.println(fno+"*"+sno+"="+ans);
			break;
		case'/':
			ans= fno/sno;
			System.out.println(fno+"/"+sno+"="+ans);
			break;
		default:
			System.out.println("Please check input once");
			
		}
		sc.close();
	}
	

}
