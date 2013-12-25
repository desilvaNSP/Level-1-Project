/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBManage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class DBManager {
    public static int SendData(Connection co,String sql) throws SQLException{
        Statement statement=co.createStatement();
        int state=statement.executeUpdate(sql);
        return state;
    }
    
    public static ResultSet getData(Connection co,String sql) throws SQLException{
        Statement statement=co.createStatement();
        ResultSet rs=statement.executeQuery(sql);
        return rs;
    }
}
