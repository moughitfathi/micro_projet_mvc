package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ClientDAO;
import DAO.ClientDAOImpl;
import models.Client;

/**
 * Servlet implementation class Identinscription
 */
@WebServlet("/Identinscription")
public class Identinscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Identinscription() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ClientDAO cl=new ClientDAOImpl();
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String submitType=request.getParameter("submit");
    Client c=cl.getClient(password,email);
     
	if(submitType.equals("identification") && c!=null && c.getName()!=null && c.getPassword()!=null){
		Client client=new Client(email,password);
		HttpSession session=request.getSession(true);
		session.setAttribute("client", client);
		
		request.setAttribute("message", c.getName());
		request.getRequestDispatcher("Acceuil1.jsp").forward(request,response);
		
		
	}else if(submitType.equals("S'inscrire") && !password.equals("") ){
		c.setEmail(email);
		c.setName(request.getParameter("name"));
		c.setSurname(request.getParameter("surname"));
		c.setAdresse(request.getParameter("adresse"));
        c.setCodepost(request.getParameter("codepost"));
        c.setCountry(request.getParameter("country"));
        c.setPassword(password);
        cl.insertClient(c);
        
		request.setAttribute("succesmessage", "REGISTER DONE");
		request.getRequestDispatcher("Identification.jsp").forward(request,response);
        
	}else if(submitType.equals("S'inscrire") && password.equals(""))  {
			request.setAttribute("failmessage", "Tu dois remplir le mot de passe");
			request.getRequestDispatcher("Inscription.jsp").forward(request,response);
			
			
	}else if(submitType.equals("identification") && (password.equals("")|| email.equals(""))) {
		request.setAttribute("failmessage", "Tu  n'as pas remplis tous les champs!!");
		request.getRequestDispatcher("Identification.jsp").forward(request,response);	
}else {
		request.setAttribute("failedmessage", "there is no one with this email!! register now");
		request.getRequestDispatcher("Inscription.jsp").forward(request,response);	
	}
    }

	}


