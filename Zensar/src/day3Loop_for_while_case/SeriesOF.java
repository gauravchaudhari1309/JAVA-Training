package day3Loop_for_while_case;
import java.util.Scanner;
public class SeriesOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int n=s.nextInt();
		int t=0;
		for(int i=0;i<=n;i++)
		{
			
			t=t*2+1;
			System.out.println(t);
			
		}
			s.close();
	}

}
