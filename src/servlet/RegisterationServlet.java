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
       
    public RegisterationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("register") != null && request.getParameter("check")!= null) {
			response.getWriter().append("registered properly at: ").append(request.getContextPath());
		}else if(request.getParameter("register")!=null && request.getParameter("check") == null) {
			response.getWriter().append("must click checkbox: ").append(request.getContextPath());
		}
		else if(request.getParameter("cancel")!=null){
			response.sendRedirect("index.jsp");
		}
	}

}
