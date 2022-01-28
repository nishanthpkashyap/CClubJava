package in.codersclub.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _2_Jdbc 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		String username="root";
		String pw="";
		String url="jdbc:mysql://localhost:3306/javajdbc1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from table1");
		while(rs.next())
		{
			System.out.println(rs.getInt("userid")+" "+rs.getString("username"));
		}
		con.close();
		st.close();
	}

}
