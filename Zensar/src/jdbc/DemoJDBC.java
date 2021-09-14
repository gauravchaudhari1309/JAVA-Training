package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DemoJDBC {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//it dynamically  load class  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ecoomerce", "root", "zxcvbnm");
			System.out.println("Connection Esatablished");
			Statement st=con.createStatement();
			//int c=st.executeUpdate("Insert into customer values(1,'Gaurav','nashik',9511999408)");
			//System.out.println("Records Updated"+c);
			
			//int c=st.executeUpdate("update customer  set  addr='pune' where cname='Gaurav'");
			//System.out.println("update"+c);
			
			int c=st.executeUpdate("delete from customer where cname='pranav'");
			System.out.println("deleted"+c);
			
			/*
			 * ResultSet rs=st.executeQuery("Select * from customer"); while(rs.next()) {
			 * System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.
			 * getLong(4)); }
			 */
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}		

	}

}
