import javax.sql.*;
import java.sql.*;

public class JDBCInsert
{
	

	public static void main(String args[])throws Exception
	{
		Statement stmt;
		ResultSet rs;
		Connection con;
		PreparedStatement ps;

		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","neha12");
			System.out.println("Connected..");
			
			 stmt=con.createStatement();
			 rs=stmt.executeQuery("Select * from Student");
			
			//for Displaying table before insert
			System.out.println(" Before Insert:- ");
			System.out.println("  Roll No  \tFname  \t Lname ");
			System.out.println("-------------------------------------------------------"); 

			while(rs.next())
			{
				System.out.println("\t"+rs.getInt("RNO")+ "\t" +rs.getString("Fname")+ "\t" +rs.getString("Lname")+ "\t" );				
			}


			//for insertion
			ps=con.prepareStatement("insert into Student values(4,'Shreya','Zaveri')");
			int i=ps.executeUpdate();
			if(i>0)
			{

				//For displaying table after insert.
				System.out.println("After Insert:- ");
				System.out.println("  Roll No  \tFname  \t Lname ");
				System.out.println("------------------------------------------------"); 
				 rs=stmt.executeQuery("Select * from Student");
				while(rs.next())
				{
					System.out.println("\t"+rs.getInt("RNO")+ "\t" +rs.getString("Fname")+ "\t" +rs.getString("Lname")+ "\t" );			
				}
			}
			
		}
		catch(SQLException se)
		{
			System.out.println(""+se);
		}
		finally
		{
			//con.close();
		}
	}
}