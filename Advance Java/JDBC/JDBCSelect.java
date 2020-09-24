import javax.sql.*;
import java.sql.*;

public class JDBCSelect
{
	
	public static void main(String args[])
	{
		Statement stmt;
		ResultSet rs;
		Connection con;
		try
		{

			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","neha12");
			System.out.println("Connected..");
			
			 stmt=con.createStatement();
			 rs=stmt.executeQuery("Select * from Student");

			System.out.println("  Roll No  \tFname  \t Lname ");
			System.out.println("-----------------------------------------------------"); 

			while(rs.next())
			{
				System.out.println("\t"+rs.getInt("RNO")+ "\t" +rs.getString("Fname")+ "\t" +rs.getString("Lname")+ "\t" );		
			}
		}
		catch(Exception se)
		{
			
		}
			
		
	}
}