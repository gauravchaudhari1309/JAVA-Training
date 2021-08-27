package day4Practical_PatternEg;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1324, num, digit;
		int r=0;
		for(num =i;num>0;num=num/10)
		{
			digit=num%10;
			r= r*10+ digit;
			
		}
		
		if(i==r)
		{
			System.out.println("Given  no is Palindrome");
		}else
			System.out.println("Given no is not a Palindrome");
	
	}

}
