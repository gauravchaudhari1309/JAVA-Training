package conitanment_Array_and_Objects;

import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Student studarr[]= new Student[3];
		
		for(int i=0;i<studarr.length;i++)
		{
			System.out.println("Enter id and name");
			int x=sc.nextInt();
			String  y=sc.next();
			
			System.out.println("How many course you want");
			int temp=sc.nextInt();
		Course crrr[]=new Course[temp];
		for(int j=0;j<crrr.length;j++)
		{
			System.out.println("Enter course and name");
			String coursename=sc.next();
			int coursefees=sc.nextInt();
			
			crrr[j] =new Course(coursename,coursefees);
			
		}
		studarr[i]=new Student(x,y,crrr); 
		}
			
		
	}

}
