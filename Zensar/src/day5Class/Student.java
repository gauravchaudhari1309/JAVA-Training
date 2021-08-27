package day5Class;
import java.util.Scanner;
public class Student {
	int id=101;
	String name="Gaurav";
	

void display(int id,String name) {
		
		 id=3;
		 name="Bunty";
		System.out.println(id+" "+name);
	}
	public int add(int a, int b) {
		
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id and name");
		Student s1=new Student();
		Student s2=new Student();
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s1.id);
		//System.out.println(s1.name);
		s1.id=sc.nextInt();
		s1.name=sc.next();
		s2.id=sc.nextInt();
		s2.name=sc.next();
		s1.display(12,"qwe");
		int sum=s1.add(50,50);
		System.out.println(sum);
		System.out.println("Your id "+s1.id);
		System.out.println("Your name "+s1.name);
		
		System.out.println("Your id "+s2.id);
		System.out.println("Your name "+s2.name);

}
}
