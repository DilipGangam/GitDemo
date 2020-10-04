package sampleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpInfo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*String host="localhost";
		String port="3306";*/
		//Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/idsqa", "root","1234");
		/*Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select * from Employeeinfo where name='lam';");
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}*/

	}
		

}
