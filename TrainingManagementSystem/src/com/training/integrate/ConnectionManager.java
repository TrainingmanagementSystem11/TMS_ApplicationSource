package com.training.integrate;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource

public class ConnectionManager {
public static  DataSource dataSource=new DataSource();
    
    private static Connection connection=null;
    public static Connection openConnection() throws ClassNotFoundException,SQLException {
        
        Class.forName(dataSource.getDriver());
        connection=DriverManager.getConnection(dataSource.getUrl(),dataSource.getUsername(),dataSource.getPassword());
        return connection;
        
    }
    
    public static void closeConnection() throws SQLException{
        
        connection.close();
    }
}
 




