package in.codersclub.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class _3_Square
 */
@WebServlet("/_3_sqr")
public class _3_Square extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("html");
		int sum=Integer.parseInt(request.getParameter("sum"));
		int sqr=sum*sum;
		PrintWriter out = response.getWriter();
		out.println("The Square of "+sum+" is : "+sqr);
	}

}
