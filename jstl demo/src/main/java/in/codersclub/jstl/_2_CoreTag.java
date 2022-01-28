package in.codersclub.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _2_CoreTag
 */
@WebServlet("/_2_CoreTag")
public class _2_CoreTag extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = "NISH";
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("2)a)CoreTag.jsp");
		rd.forward(request, response);
	}

}
