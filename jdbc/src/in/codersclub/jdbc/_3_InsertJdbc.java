package in.codersclub.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _3_InsertJdbc 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String pw="",username="root",url="jdbc:mysql://localhost:3306/javajdbc1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, pw);
		Statement st=con.createStatement();
		int count = st.executeUpdate("update table1 set userid = 4 where username='wish'");
		System.out.println(count+" rows affected.....");
		System.out.println("Updated Table is:");
		ResultSet rs = st.executeQuery("select * from table1");
		while(rs.next())
		{
			System.out.println(rs.getInt("userid")+" "+rs.getString("username"));
		}
		con.close();
		st.close();
		

	}

}
