package com.training.integrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
public static  DataSource dataSource=new DataSource();

	
	private static Connection connection1=null;
	public static Connection openConnection1() throws ClassNotFoundException,SQLException {
		
		Class.forName(dataSource.getDriver());
		connection1=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
		return connection1;
		
	}
	
	public static void closeConnection1() throws SQLException{
		
		connection1.close();
	}

    private static Connection connection=null;
    public static Connection openConnection() throws ClassNotFoundException,SQLException {
        
        Class.forName(dataSource.getDriver());
        connection1=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
        return connection1;
        
    }
    
    public static void closeConnection() throws SQLException{
        
        connection1.close();
    }

}
 




