package day6Methods;

import java.util.Scanner;

public class TestMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the movie id and name");
		Movie m1=new Movie(1,"movie1",null);
		System.out.println("Enter actor id , namee and gender");
		int aid=sc.nextInt();
		String anm=sc.next();
		char agen=sc.next().charAt(0);
		Actor a1= new Actor( 01,"act01",'F');
		
		m1.setAct(a1);
		
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		
		
		
	}

}
