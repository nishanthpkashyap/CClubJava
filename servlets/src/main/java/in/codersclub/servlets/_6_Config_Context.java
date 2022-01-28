package in.codersclub.servlets;

import java.io.IOException;


import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/_6_Config_Context")
public class _6_Config_Context extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		ServletConfig config = getServletConfig();
		ServletContext context=getServletContext();
		String sConfig = config.getInitParameter("name");
		String sContxt = context.getInitParameter("name");
		response.getWriter().println("Hi Config object is : "+sConfig+"<br><br>");
		response.getWriter().println("Hi Context object is : "+sContxt);
	}

}
