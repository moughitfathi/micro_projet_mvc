package database;

import java.sql.Connection;
import java.sql.Statement;

import connection.MyConnection;

public class CreateDatabase {
	public static void main(String[] args ) {
		Statement stmt=null;
		String dbName="microprojetmvc";
	try {
			Connection con=MyConnection.getConn();	
		stmt=con.createStatement();
		stmt.executeUpdate("DROP DATABASE "+dbName);
		stmt.executeUpdate("CREATE DATABASE "+dbName);
		stmt.executeUpdate("USE "+dbName+";");
		stmt.executeUpdate("create table Client(Id int(10) primary key NOT NULL AUTO_INCREMENT ,Email varchar(100) Unique,Nom varchar(100),Prenom varchar(100),Adresse varchar(100),CodePostal int(10),Ville varchar(100),Motpasse varchar(100) NOT NULL)");
		stmt.executeUpdate("create table Commande(NumCommande int(10) primary key,DateCommande date,CodeClient int(10),FOREIGN KEY(CodeClient) REFERENCES Client(Id))");
		stmt.executeUpdate("create table Categorie(RefCat int(100) primary key,Cat varchar(100))");
		stmt.executeUpdate("create table Article(CodeArticle int(10) primary key,Designation varchar(100),Prix int(10),Stock int(10),Categorie int(10),photo varchar(100),FOREIGN KEY(Categorie) REFERENCES Categorie(RefCat))");
		stmt.executeUpdate("create table lignecommandes(NumCommande int(10),CodeArticle int(10),QteCde int(10),FOREIGN KEY(NumCommande) REFERENCES Commande(NumCommande),FOREIGN KEY(CodeArticle) REFERENCES Article(CodeArticle))");	
/*
		if(status>0) {
			System.out.println("database created successfully");
		}
*/	
		stmt.executeUpdate("insert into Categorie(RefCat,Cat) values(1,'jazz')");
		stmt.executeUpdate("insert into Categorie(RefCat,Cat) values(2,'hiphop')");


		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(1,'article1',180,11,1,'/images/article1.jpg')");
		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(2,'article2',185,20,1,'/images/article2.jpg')");
		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(3,'article3',165,94,1,'/images/article3.jpg')");
		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(4,'article4',194,67,2,'/images/article4.jpg')");
		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(5,'article5',110,91,2,'/images/article5.jpg')");
		stmt.executeUpdate("insert into Article(CodeArticle,Designation,Prix,Stock,Categorie ,photo) values(6,'article6',240,64,2,'/images/article6.jpg')");

		
	}catch(Exception e) {
		e.printStackTrace();
	}

				
	}

}
