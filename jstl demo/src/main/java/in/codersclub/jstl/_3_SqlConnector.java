
//THIS PROGRAM IS WRITTEN FOR PRACTICE

package in.codersclub.jstl;

import java.sql.*;

public class _3_SqlConnector 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/gadgetsdb",user="root",password="",query="select * from gadgets";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("price"));
		}
		st.close();
		con.close();
	}
}
