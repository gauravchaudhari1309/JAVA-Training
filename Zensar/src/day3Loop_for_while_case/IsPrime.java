package day3Loop_for_while_case;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=31;
		boolean flag=true;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
					flag=false;
					break;
			}
		}if(flag)
			System.out.println("num is prime");
		else
			System.out.println("num is not prime");
	}

}
