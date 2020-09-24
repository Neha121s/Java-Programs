import javax.sql.*;
import java.sql.*;

public class JDBCDelete
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
			
			//for Displaying table before delete.
			System.out.println(" Before Deletion:- ");
			System.out.println("  Roll No  \tFname  \t Lname ");
			System.out.println("--------------------------------------------------------"); 

			while(rs.next())
			{
				System.out.println("\t"+rs.getInt("RNO")+ "\t" +rs.getString("Fname")+ "\t" +rs.getString("Lname")+ "\t" );				
			}


			//for deletion.
			ps=con.prepareStatement("delete from student where RNO=4");
			int i=ps.executeUpdate();
			if(i>0)
			{

				//For displaying table after delete.
				System.out.println(" After Deletion:- ");
				System.out.println("  Roll No  \tFname  \t Lname ");
				System.out.println("-----------------------------------------------------------"); 
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