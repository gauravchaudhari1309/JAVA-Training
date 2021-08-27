package day5Class2;

public class Account {
	long accountNo = 123456789;
	String customername = "qwerty";

//	Account() {
//
//		this.accountNo = 987654321;
//		this.customername = "asdfgh";
//		System.out.println("Im default constructor");
//	}

	Account(int ano, String cname) {
		this.accountNo = ano;
		this.customername = cname;
		System.out.println("Im parameterised constructor");
	}

	public static void main(String[] args) {
		Account a1 = new Account(12324, "ABCD" );
		System.out.println(a1.accountNo);
		System.out.println(a1.customername);
		
//		Account a2 = new Account( );
//		System.out.println(a2.accountNo);
//		System.out.println(a2.customername); 	

		// Account a3= new Account(54321,"zxcvbnm");
		// System.out.println(a3.accountNo);
		// System.out.println(a3.customername);
	}
}

//Default constructor is provided by Java to facilitate the creation of a new object, here variables are assigned default values
//Since you have defined a (default) constructor, Java does not provide another one
//If any single constructor is present in the source code, Java will not provide a default