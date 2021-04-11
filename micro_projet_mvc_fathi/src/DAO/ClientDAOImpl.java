package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.MyConnection;
import models.Client;

public class ClientDAOImpl implements ClientDAO {
	
	
	static Connection con;
	static PreparedStatement ps;
      @Override
	  public int insertClient(Client c) {
          int status=0;
    	  try {
			  con=MyConnection.getConn();
			  ps=con.prepareStatement("insert into Client(Email, Nom,Prenom, Adresse ,CodePostal ,Ville ,Motpasse ) values(?,?,?,?,?,?,?)");
			  ps.setString(1,c.getEmail());
			  ps.setString(2,c.getName());
			  ps.setString(3,c.getSurname());
			  ps.setString(4,c.getAdresse());
			  ps.setString(5,c.getCodepost());
			  ps.setString(6,c.getCountry());
			  ps.setString(7,c.getPassword());
			  status=ps.executeUpdate();
			  con.close();
		  }catch(Exception e) {
		   e.printStackTrace();
		  }
		  return status;
	  }
      
	  @Override
	  public Client getClient( String password, String email) { 
		  Client c=new Client();
		  try {
			  con=MyConnection.getConn();
			  ps=con.prepareStatement("select * from Client where email=? and motpasse=?");
			  ps.setString(1,email);
			  ps.setString(2,password);    
			  ResultSet rs=ps.executeQuery();
			  while(rs.next()) {
				    c.setEmail(rs.getString(1));
			        c.setName(rs.getString(2));
			        c.setSurname(rs.getString(3));
			        c.setAdresse(rs.getString(4));
			        c.setCodepost(rs.getString(5));
			        c.setCountry(rs.getString(6));   
			        c.setPassword(rs.getString(7)); 
			  
			  }


			  
		  }catch(Exception e) {
		   e.printStackTrace();
		   
		  }
		  
		  
		  return c;
	  }
		  
		  
	  }

