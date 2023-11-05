// HelloWorldServlet.java

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.getWriter().write("Hello World!");
	}
	
}
