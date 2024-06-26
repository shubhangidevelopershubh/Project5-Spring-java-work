package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;
import jdbc.LoginDAO;


@WebServlet("/LoginServlet") //URL Mapping
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      LoginDAO logindao; 
   //default Constructor
    public LoginServlet() {
      logindao = new LoginDAO();
        
    }

	
	//Post Method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =  request.getParameter("username");
		String password =  request.getParameter("password");
		
		LoginBean loginbean = new LoginBean();
		loginbean.setUsername(username);
		loginbean.setPassword(password);
		
		try{
			if(logindao.validate(loginbean)){
				response.sendRedirect("loginsuccess.jsp");
			}else{
				response.sendRedirect("login.jsp");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}

	