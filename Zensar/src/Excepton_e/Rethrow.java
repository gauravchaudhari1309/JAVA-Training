package Excepton_e;

public class Rethrow {

	public static void test1() throws Exception {
		System.out.println("Exception in test method");
		throw new Exception("Throw from test method");
	}
	
public static void test2() throws Throwable
{
		try {
		test1(); 
	}catch(Exception e) {
		System.out.println("In test 2 method");
		throw e;
	}
	}
	
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			test2();
		} catch (Exception e) {
			System.out.println("Caught in method");
		}
		
		
	}

}
