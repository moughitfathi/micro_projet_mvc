package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MyConnection;
import models.Article;

public class ArticleDAO {
	    static Connection con;
	    public Article get(int code) throws SQLException {
	        Article article = null;
	        String sql = "SELECT * FROM Article WHERE CodeArticle = ?";
	        try  {
	        	con=MyConnection.getConn();
	            PreparedStatement ps = con.prepareStatement(sql); 
	            ps.setInt(1, code );
	            ResultSet result = ps.executeQuery();
	            if (result.next()) {
	                article = new Article();
	                 int codearticle=result.getInt("CodeArticle");
	            	 String designation=result.getString("Designation");
	            	 int prix=result.getInt("Prix");
	            	 int stock=result.getInt("Stock"); 
	            	 String categorie=result.getString("Categorie");
	            	 String photo=result.getString("photo");
	            	
	            	 
	                article.setCodearticle(codearticle);
	                article.setDesignation(designation);
	                article.setPrix(prix);
	                article.setStock(stock);
	                article.setCategorie(categorie);
	                article.setPhoto(photo);
	            }          
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw e;
	        }      
	         
	        return article;
	    }

	
}
