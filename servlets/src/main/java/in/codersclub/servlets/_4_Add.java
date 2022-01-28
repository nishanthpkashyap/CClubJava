package in.codersclub.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class _4_Add
 */
@WebServlet("/_4_add")
public class _4_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int sum=num1+num2;
		PrintWriter out = response.getWriter();
		out.println("The sum of "+num1+" and "+num2+" is : "+sum);
		HttpSession session = request.getSession();
		session.setAttribute("sum", sum);
		response.sendRedirect("_4_square");
	}

}
