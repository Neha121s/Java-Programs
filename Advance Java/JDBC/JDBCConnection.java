import javax.sql.*;
import java.sql.*;

public class JDBCConnection 
{
	

	public static void main(String args[])throws Exception
	{
		Statement stmt;
		ResultSet rs;
		Connection con;

		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","neha12");
			System.out.println("Connected..");

		}
		catch(SQLException se)
		{
			System.out.println(" "+se);
		}
		finally
		{
			//con.close();
		}
	}
}