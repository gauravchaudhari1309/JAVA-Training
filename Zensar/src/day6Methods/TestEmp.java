	package day6Methods;

import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Emp e1=new Emp();
		System.out.println("Enter emp id, name, salary");
		int id=sc.nextInt();
		String nm=sc.next();
		int sal=sc.nextInt();
		e1.seteId(id);
		e1.seteName(nm);
		e1.setSalary(sal);
		
		System.out.println("Enter your dept id and name");
		int did=sc.nextInt();
		String dnm=sc.next();
		Dept d1=new Dept(did,dnm);
		
		e1.setDept(d1);
		
		System.out.println(e1.geteName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDept());
		
	}

}
