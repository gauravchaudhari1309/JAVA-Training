package day5Class;

public class Account {
	public long accno;
	public String Cname;
	Account() {
		
		this.accno =  12;
		Cname = "ABC";
	}
	Account(long accno, String cname) {
		
		this.accno = 123;
		Cname = "XYZ";
		System.out.println("im parameterised constructor");
	}
	
	public static void main(String[] args) {
		Account a1= new Account();
		
	}

}
