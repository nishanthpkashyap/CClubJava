package in.codersclub.jstl;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _2_a_StudentServlet
 */
@WebServlet("/_2_a_StudentServlet")
public class _2_a_StudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		_2_Student s1 = new _2_Student();
		s1.setName("NISH");
		s1.setRollno(1);
		_2_Student s2 = new _2_Student();
		s2.setName("KORRY");
		s2.setRollno(2);
		_2_Student s3 = new _2_Student();
		s3.setName("HARRY");
		s3.setRollno(3);
		
		List<_2_Student> s = Arrays.asList(s1,s2,s3); 
		
		request.setAttribute("students", s);
		RequestDispatcher rd = request.getRequestDispatcher("2)b)Coretag.jsp");
		rd.forward(request, response);
	}

}
