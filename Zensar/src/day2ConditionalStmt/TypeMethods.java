package day2ConditionalStmt;
//import java.util.Scanner;

public class TypeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner s= new java.util.Scanner(System.in);
		System.out.println("Enter the 3 No: ");
		byte a=s.nextByte();
		short b=s.nextShort();
		int c=s.nextInt();
		
		System.out.println("Enter the height");
		float h=s.nextFloat();
		
		System.out.println("Enter the mobile ");
		long mb=s.nextLong();
		
		System.out.println("Enter the first Name");
		String nm=s.next();
		
		System.out.println("Enter the Gender");
		char ch=s.next().charAt(0);
		
		System.out.println("Add is "+ (a+b+c));
		System.out.println("Height is "+ h);
		System.out.println("Mobile no is " + mb);
		System.out.println("First name is "+ nm);
		System.out.println("Your gender is "+ ch);
		
		//explicite (type casting)
		float f=5.6f;
		short ps=(short)f;
		System.out.println(ps);
	}

}
