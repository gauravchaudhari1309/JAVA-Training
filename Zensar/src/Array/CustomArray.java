package Array;

import java.util.Scanner;

public class CustomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] studarr= new Student[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<studarr.length;i++) {
			
			System.out.println("Enter student  id , name , percentage(non decimal value)");
			
			int id=sc.nextInt();
			String name=sc.next();
			int per=sc.nextInt();
			
			studarr[i]= new  Student(id,name,per);
			
			
			
		}
		
	}

}
