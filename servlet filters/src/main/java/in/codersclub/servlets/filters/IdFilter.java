package in.codersclub.servlets.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/DemoServlet")
public class IdFilter implements Filter 
{   

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		if(id>=1)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Wrong ID format !!");
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
