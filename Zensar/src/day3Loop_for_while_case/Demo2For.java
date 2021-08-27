package day3Loop_for_while_case;

public class Demo2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, avg=0;
		
		for(int n=2;n<20;n=n+2) {
			
			sum=sum+n;
			System.out.println("sum is"+sum);
			{
			avg	=sum/10;
			System.out.println("avg is"+avg);
			}
		}
		
	}

}
