package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.User;
import services.registrationServices.interfaces.RegistrationServicesLocal;

/**
 * Servlet implementation class MyFirstServlet
 */
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private RegistrationServicesLocal registrationServicesLocal ; 	//@EJB Injection
	
	private User user = new User();
	
	
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyFirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("n");
		PrintWriter printWriter = response.getWriter();
		Date date = new Date();
		printWriter.write("<h1>Alha "+name+" dans la servlet</h1> <br> il est : " + date);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
