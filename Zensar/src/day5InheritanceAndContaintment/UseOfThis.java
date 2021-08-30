package day5InheritanceAndContaintment;
//this can be used to refer current class instance variable.														
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.
		 

public class UseOfThis {
	
	int no1;
	int no2;
	
		
	UseOfThis(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}

	void fun() {
		System.out.println("Helllo funcction");
	}
	void met() {
		System.out.println("Hello method");
	
	
	this.fun();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseOfThis t1= new UseOfThis(1, 2);
		t1.met() ;
		
		
	
	}

}
