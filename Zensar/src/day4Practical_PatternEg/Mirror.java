package day4Practical_PatternEg;

public class Mirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=5;i++)
		{
			// for(int j=i;j<=5;j++){
			//  System.out.print("  "); }
			 
			for(int j=i;j>=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
				}
			}
}