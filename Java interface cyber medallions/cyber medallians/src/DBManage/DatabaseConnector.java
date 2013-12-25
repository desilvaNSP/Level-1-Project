/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBManage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class DatabaseConnector {
    public static Connection makeConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost/cyberm","root","123");
        return connection;
   }
    
}
