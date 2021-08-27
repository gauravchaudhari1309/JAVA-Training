package day4Practical_PatternEg;
// pattern program
public class PatternUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc= new Scanner(System.in);
		for(int i= 1; i<=4;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if((i==1 || j==6) || (i==4 || j==6 ))
				System.out.print("*");
				
			}
			System.out.println();
		}
		//sc.close ();
	}

}
