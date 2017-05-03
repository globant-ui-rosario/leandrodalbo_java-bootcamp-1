
package leaMavenK4;

import javax.servlet.*;
import javax.servlet.http.*;

import leaMavenK12.App;

import java.io.*;

public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 7210182314437646527L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println(App.getHello(request.getParameter("name")));
		out.flush();
		out.close();
	}
}