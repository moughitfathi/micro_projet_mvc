package controllers;

import java.io.IOException;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ArticleDAO;
import models.Article;
/**
 * Servlet implementation class ArticleController
 */
@WebServlet("/ArticleController")
public class ArticleController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public ArticleController() {
        super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int code = Integer.parseInt(request.getParameter("code"));
        ArticleDAO ar = new ArticleDAO();
         
        try {
            Article article = ar.get(code);
             
            request.setAttribute("article", article);
            
           request.getRequestDispatcher("Article.jsp").forward(request, response);              
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
         
    }
}