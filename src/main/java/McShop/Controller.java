package McShop;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/controller")
public class Controller extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DBConnection db = new DBConnection();
	private UserVal valuser = new UserVal();
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		 response.setContentType("text/html");  
	     PrintWriter out=response.getWriter();  
	     
		
	    String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(""+username);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		try {
			if (valuser.validate(user) ) {
				//response.sendRedirect("main.jsp");
				session.setAttribute("name", username);
				response.sendRedirect("main.jsp?name=" + username.toString());				
			}else {
				 request.getRequestDispatcher("index.jsp").include(request, response);  
			}
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	
}
