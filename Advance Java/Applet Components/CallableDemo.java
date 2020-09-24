import java.sql.*;
import javax.sql.*;

public class CallableDemo 
{
	public static void main(String args[])throws Exception
	{
		Connection con;
		Statement st,st1;
		ResultSet rs,rs1;

		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","neha12");

		st=con.createStatement();
		rs=st.executeQuery("select * from student");

		System.out.println("Before Exceution of Procedure:- ");
		System.out.println("RNO \t Fname \t Lname ");
		System.out.println("----------------------------------------------");

		while(rs.next())
			{
				System.out.println("\t"+rs.getInt("RNO")+ "\t" +rs.getString("Fname")+ "\t" +rs.getString("Lname")+ "\t" );		
			}


		CallableStatement stmt=con.prepareCall("{call demo(?,?,?)}");
		stmt.setInt(1,6);
		stmt.setString(2,"Manavi");
		stmt.setString(3,"Thorve");

		stmt.execute();


		st1=con.createStatement();
		rs1=st1.executeQuery("select * from student");

		System.out.println("After exceution of procedure:- ");
		System.out.println("RNO \t Fname \t Lname ");
		System.out.println("----------------------------------------------");
		while(rs1.next())
			{
				System.out.println("\t"+rs1.getInt("RNO")+ "\t" +rs1.getString("Fname")+ "\t" +rs1.getString("Lname")+ "\t" );		
			}
	}
}
		
		

		
		