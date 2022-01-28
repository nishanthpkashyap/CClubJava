package in.codersclub.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _4_Insertjdbc2 
{

	public static void main(String[] args) throws ClassNotFoundException ,SQLException
	{
		String pw="",query="insert into table1 values (?,?) ",uname="root",url="jdbc:mysql://localhost:3306/javajdbc1",username="ROCK";
		int count,userid=5;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pw);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, username);
		count = st.executeUpdate();
		ResultSet rs= st.executeQuery("select * from table1");
		System.out.println(count+" rows affected.....\n"+"The Updated Table is:");
		while(rs.next())
		{
			System.out.println(rs.getInt("userid")+" "+rs.getString("username"));
		}
		con.close();
		st.close();
	}

}
