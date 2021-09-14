		package String;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String email="gaurav@gmail.com";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mail id: ");
		String email=sc.next();
		
		if(email.contains("@gmail") && email.contains(".com")) //|| email.contains(".") )
		{
			int i1=email.indexOf('@');
			int i2=email.indexOf('.');
				if(i1<i2)
				{
					System.out.println("Valid email");
				}
				else
				{
					System.out.println("Invalid email ");
				}
			
		}
		else
		{
			System.out.println("Invalid Mail");
		}
	}

}
