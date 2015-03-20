package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet") //URLMapping
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html; charset= UTF-8");
		 request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("name");
		String i = request.getParameter("id");
		String p = request.getParameter("pwd");
		out.print("hello - get <br>");
		out.print("이름" + n + "<br>");
		out.print(i + "<BR>");
		out.print(p);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		 response.setContentType("text/html; charset=UTF-8");
		 request.setCharacterEncoding("UTF-8");
		
		 PrintWriter out = response.getWriter();
		String n = request.getParameter("name");
		String i = request.getParameter("id");
		String p = request.getParameter("pwd");
		out.print("hello - get <br>");
		out.print("이름" + n + "<br>");
		out.print(i + "<BR>");
		out.print(p);
		out.print("hello - post");
		
	}

}
