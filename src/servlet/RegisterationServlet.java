package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegiAuth")
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final String PASSWORD_PATTERN = "((?=.*[a-z])(?=.*\\\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,12})";
       
    public RegisterationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fn = request.getParameter("firstName");
		String ln = request.getParameter("lastName");
		String ad = request.getParameter("address");
		String em = request.getParameter("email");
		String pw = request.getParameter("password");
		String cfpw = request.getParameter("confPassword");
		
		if (request.getParameter("register") != null && request.getParameter("check")!= null) {
			if(fn == null || fn == ""){
				request.setAttribute("fnMessage", "This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else if(ln == null || ln == ""){
				request.setAttribute("lnMessage", "This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else if(ad == null || ad == "") {
				request.setAttribute("adMessage", "This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else if(em == null || em == "") {
				request.setAttribute("emMessage", "This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else if(pw == null || pw == "") {
				request.setAttribute("pwMessage","This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);;
			}else if(cfpw == null || cfpw == "") {
				request.setAttribute("cfpwMessage", "This field cannot be empty");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			/*
			else if(pw != cfpw) {
				request.setAttribute("cfpwMesage", "Confirm Password must patch Password");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}else if(pw.contains(PASSWORD_PATTERN)== false) {
				request.setAttribute("pwMessage",  "Password must be 6-12 characters long, at least 1 uppercase and 1 special character");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}*/
			else {
				response.getWriter().append("registered properly at: ").append(request.getContextPath());
			}
		}else if(request.getParameter("register")!=null && request.getParameter("check") == null) {
			request.setAttribute("cbMessage", "You must agree to the terms of service");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
		else if(request.getParameter("cancel")!=null){
			response.sendRedirect("index.jsp");
		}
	}

}
