package ukki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.print("hello square ");
		//When we use session method
		/*int k=(int) req.getAttribute("k");
		k=k*k;
		out.println(k);*/
		
		//using redirect method
		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		out.println("Result is"  + k );
	}


}
