package ukki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	//We can also use public void service()
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{	//HttpSession session=req.getSession();
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//session.setAttribute("k", k);
		
		Cookie cookie=new Cookie("k" , k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}