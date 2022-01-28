package in.codersclub.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.codersclub.loginapp.gto.User;
import in.codersclub.loginapp.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		LoginService service = new LoginService();
		boolean result = service.getAuthentication(password);
		if(result)
		{
			User user = service.getUserDetails(userid);
			request.setAttribute("user", user);
			RequestDispatcher dispatch = request.getRequestDispatcher("success.jsp");
			dispatch.forward(request, response);
			return;
		}
		else
		{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
