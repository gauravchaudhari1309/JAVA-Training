package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
	
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ecoomerce", "root", "zxcvbnm");
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter id,name,address and mobile");
			int cid=sc.nextInt();
			String  nm=sc.next();
			String addr=sc.next();
			long mb=sc.nextLong();
			
			String query="insert into customer values("+cid+",'"+nm+"','"+addr+"',"+mb+")";
			//String query="update table customer set "
			System.out.println(query);
			Statement st=con.createStatement();
		
			int c=st.executeUpdate(query);
			System.out.println("record inserted "+c);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
