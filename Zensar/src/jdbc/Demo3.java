package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_ecoomerce", "root", "zxcvbnm");Scanner sc= new Scanner(System.in);)
				{
				PreparedStatement pst= con.prepareStatement("insert into customer values(?,?,?,?)");
				System.out.println("Enter id,name,address and mobile");
				int cid=sc.nextInt();
				String  nm=sc.next();
				String addr=sc.next();
				long mb=sc.nextLong();
		
				
				pst.setInt(1, cid);
				pst.setNString(2, nm);
				pst.setString(3, addr);
				pst.setLong(4, mb);
				
				int c=pst.executeUpdate();
				System.out.println("Updated"+c);
				
				System.out.println("delete record:");
				pst=con.prepareStatement("delete from custmer where cname=?");
				pst.setString(2,"neha");
				int c1=pst.executeUpdate();
				System.out.println(c1+"Recoed deleted");
				
				System.out.println("update record:");
				pst=con.prepareStatement("update custmer set addr=? where cust_id=?");
				pst.setString(1,"thane");
				pst.setInt(2,2);
				int c2=pst.executeUpdate();
				System.out.println(c2+"Record updated");
				
				System.out.println("Print all recod in table");
				pst=con.prepareStatement("Select * from customer");
				ResultSet rst=pst.executeQuery();
				while(rst.next())

				{
					System.out.println(rst.getInt(1)+""+rst.getString(2)+""+rst.getString(3)+""+rst.getLong(4));
					
				}
				
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
