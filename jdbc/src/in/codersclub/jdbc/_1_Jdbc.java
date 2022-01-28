package in.codersclub.jdbc;
import java.sql.*;


/*
 * 1.import sql package
 * 2.load and register the driver
 * 3.establish connection
 * 4.create a query
 * 5.execute the query
 * 6.process results
 * 7.terminate the connections
 */

public class _1_Jdbc 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url="jdbc:mysql://localhost:3306/javajdbc1" ;
		String username="root";
		String password="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select username from table1 where userid=3");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		con.close();
		st.close();
	}
}
