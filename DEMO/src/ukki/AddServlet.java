package ukki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	//We can also use public void service()
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{	 
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//If there is a work on single servlet
		/*PrintWriter out= res.getWriter();
		out.println("result is " + k);*/
		
		// if one servlet request to another servlet
		// By using session method
		/*req.setAttribute("k", k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);*/
		
		//by using Redirect method
		res.sendRedirect("sq?k" + k);
		
		
		 
		
	}
}
