package controllers;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InternationalisationController
 */
@WebServlet("/InternationalisationController")
public class InternationalisationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InternationalisationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String[] planguage=request.getParameter("Language").split("_");
	    String language=planguage[0];
	    String country=planguage[1];
	    Locale locale=new Locale(language,country);
		request.setAttribute("language", request.getParameter("language"));
		ResourceBundle resourceBundle=ResourceBundle.getBundle("resources.content",locale);
		
		request.setAttribute("string",resourceBundle.getString("key"));
		request.setAttribute("string1",resourceBundle.getString("key2"));
		request.setAttribute("string2",resourceBundle.getString("key3"));
		request.setAttribute("string3",resourceBundle.getString("key4"));
		request.setAttribute("string4",resourceBundle.getString("key5"));


				
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}

}
