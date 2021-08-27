package day6Methods;

import java.util.Scanner;

public class Account {

	  int id;
	  String name;
	  int balance;
	  
	  
	Account(int id, String name, int balance){
	
	this.id	= id;
	this.name = name;
	this.balance = balance;	
	}
	
	 void withdraw(int amount)
	 {
		 if(amount>balance)
	System.out.println("insufficient Balance");
		 else {
			 balance=balance- amount;
			 System.out.println("Withdraw success");
		 }
	 }
		 void deposite(int amount)
		 {
			 balance= balance + amount;
			 System.out.println("Deposited successfully");
		 }
	 void checkBal()
	 {
		 System.out.println("your balnce is "+balance);
	 }
	
	// public static void main()
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account a=new Account(1,"anand",200000);
				
		a.deposite(25788);
		a.withdraw(500000);
		a.checkBal();
		System.out.println();
		
	} 
	 
	
}
  