package day5InheritanceAndContaintment;

public class Cycle {									 														
	int accountNo;										 
	int noOfWheels;										 
	Cycle() {											 
		this.accountNo = accountNo;						 
		this.noOfWheels = noOfWheels;					 
		System.out.println("Im default constuctor");
	}
	
	Cycle(int acno, int nofwheel)
	{
		this.accountNo=acno;
		this.noOfWheels=nofwheel;
		System.out.println("im another constructor");
		
	}
	
	public static void main(String[] args) {
		Cycle c1= new Cycle();			//op- Im default constuctor
		Cycle c2= new Cycle(1234,4);
		System.out.println(c2.accountNo);
		System.out.println(c2.noOfWheels);
	}
}
