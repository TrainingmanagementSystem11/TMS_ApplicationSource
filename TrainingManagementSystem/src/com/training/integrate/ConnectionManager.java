package com.training.integrate;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
public class ConnectionManager {
public static  DataSource dataSource=new DataSource();
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
	
	private static Connection connection1=null;
	public static Connection openConnection1() throws ClassNotFoundException,SQLException {
		
		Class.forName(dataSource.getDriver());
		connection1=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
		return connection1;
		
	}
	
	public static void closeConnection1() throws SQLException{
		
		connection1.close();
	}
<<<<<<< HEAD

    private static Connection connection=null;
    public static Connection openConnection() throws ClassNotFoundException,SQLException {
        
        Class.forName(dataSource.getDriver());
        connection1=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
        return connection1;
        
    }
    
    public static void closeConnection() throws SQLException{
        
        connection1.close();
    }

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
}
 




