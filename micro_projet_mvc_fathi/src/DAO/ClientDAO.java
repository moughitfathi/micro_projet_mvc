package DAO;

import models.Client;

public interface ClientDAO {
	
	  public int insertClient(Client c);
	  public Client getClient( String password, String email); 


} 