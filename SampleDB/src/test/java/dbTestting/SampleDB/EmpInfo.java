package dbTestting.SampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmpInfo {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		/*String host="localhost";
		String port="3306";*/
		//Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/idsqa", "root","1234");
		Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select * from Employeeinfo where name='lam';");
		
		
		while(rs.next())
		{
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://login.salesforce.com");
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("name"));
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("location"));
			System.out.println("this my first code to commit to master");
			System.out.println("try to get new job");
			System.out.println("Need to new salary");

			System.out.println("this my first code to commit to branch");
			System.out.println("need to get new job");
			System.out.println("Need to big new salary");
			
			//commit for new branch
			 
			System.out.println("this my second code to commit to branch");
			System.out.println("need to get new job");
			System.out.println("Need to big new salary");
		}

}
}
