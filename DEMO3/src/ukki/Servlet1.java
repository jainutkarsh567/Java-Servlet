package ukki;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	List<Student> stud=Arrays.asList(new Student(1,"raju",20),
			new Student(2,"raju",21),new Student(3,"raju",22));
	request.setAttribute("student", stud);
	
	}
	

}
