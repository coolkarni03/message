package message;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class MyMessage extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException
		    {
		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Friendly Message</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Stay Safe, Stay Healthy...!!!</h1>");
		        out.println("</body>");
		        out.println("</html>");
		    }
}