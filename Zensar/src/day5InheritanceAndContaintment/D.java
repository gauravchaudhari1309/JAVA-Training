package day5InheritanceAndContaintment;

import day5Class.A;

public class D extends A {
	
	public void method() {
		//using subclass accessible outside the package 
		System.out.println(c);
	}
}
