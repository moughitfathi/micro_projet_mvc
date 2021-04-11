package connection;

import java.sql.Connection;
import java.sql.DriverManager;




public class MyConnection {

	static Connection con=null;
	public static Connection getConn(){
		try {
			String dbDriver="com.mysql.jdbc.Driver";
			String dbURL="jdbc:mysql://localhost:3306/";
			String dbName="microprojetmvc";
			String dbUsername="root";
			String dbPassword="1997";
		    Class.forName(dbDriver);
		    con=DriverManager.getConnection(dbURL+dbName,dbUsername,dbPassword);		
         }catch(Exception e) {
	        e.printStackTrace();
         }
		return con;
	}
}

