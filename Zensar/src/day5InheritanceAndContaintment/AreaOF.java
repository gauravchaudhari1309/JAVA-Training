package day5InheritanceAndContaintment;
// same function name with different parameter
public class AreaOF {
	
	void area(int lenght,int breadth) {
		
		System.out.println("Area of rectangle"+lenght*breadth);
	}
	
	void area(int side) {
		
		System.out.println("Area of Sqaure"+side*side);
	}

}
