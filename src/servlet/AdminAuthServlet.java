package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;

@WebServlet("/AdminAuth")
public class AdminAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AdminAuthServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User admin = new User("Admin", "Guy", "admin@isp.net", "some address", "admin", "admin@isp.net", "P@ssword1");
		
		if (request.getParameter("login") != null) {
			if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
				request.setAttribute("firstName", admin.getFirstName());
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			}
			else {
				request.setAttribute("message", "Invalid Username and/or password");
				request.getRequestDispatcher("index.jsp").forward(request,response);
			}
		}
		else if(request.getParameter("register")!=null){
			response.sendRedirect("register.jsp");
		}
	}

}
