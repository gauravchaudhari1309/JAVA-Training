package CustomArray_And_Sort;

import java.util.Scanner;

public class Student {

	int id;
	String name;
	long mob[];
	public Student(int id, String name, long[] mob) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;

	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Student arr[] = new Student[5];
		System.out.println("Enter Student details :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter id and name: ");
			int id=sc.nextInt();
			String name=sc.next();
			
			String mno="";
			char choice=' ';
			
			do {
				
				System.out.println("Enter number");
				String temp=sc.next();
				
				mno=mno+temp;
				
				System.out.println("Do you have another no: y/n ");
				choice=sc.next().charAt(0);
				}while(choice=='y'); 
					String mnoarr[]=mno.split("");
					long lrr[]= new long[mnoarr.length];
					for(int k=0;k<lrr.length;k++)
					{
						lrr[k]=Long.parseLong(mnoarr[k]);
					}
					arr[i]= new Student(id,name,lrr);
		
		}
	}

}
