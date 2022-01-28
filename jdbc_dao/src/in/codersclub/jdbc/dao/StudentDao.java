package in.codersclub.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao 
{
	public Student getStudent(int rollno) throws ClassNotFoundException
	{
		Student s = new Student();
		s.setrollno(rollno);
		String sname;
		String uname="root",pw="",url="jdbc:mysql://localhost:3306/javajdbc1";
		//String query="select username from table1 where userid="+String.valueOf(rollno);
		Class.forName("com.mysql.cj.jdbc.Driver");
		try
		{
		Connection con = DriverManager.getConnection(url, uname, pw);
		PreparedStatement st = con.prepareStatement("select username from table1 where userid=?");
		st.setInt(1, rollno);
		ResultSet rs=st.executeQuery();
		/*Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);*/
		
		rs.next();
		sname=rs.getString("username");
		s.setsname(sname);
		return s;
		}
		catch(SQLException e)
		{
			System.out.println("Wrong rollno");
			System.exit(-1);
			return null;
		}
		
	}
}
