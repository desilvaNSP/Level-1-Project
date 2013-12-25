/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UniqueClasses;

import DBManage.DBManager;
import DBManage.DatabaseConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class PaidController {
 
   public static int addpaidaccounts(paidModel pm) throws SQLException, ClassNotFoundException{
        Connection connection=DatabaseConnector.makeConnection();
        String sql="Insert into paidaccount values('"+pm.getPaidID()+"','"+pm.getBalance()+"','"+pm.getPreviousMonth()+"','"+pm.getOwnerID()+"')";
        int state=DBManager.SendData(connection, sql);
        return state;
   }
   public static ResultSet searchpaidaccountsbyRegno(paidModel pm) throws SQLException, ClassNotFoundException{
       Connection connection=DatabaseConnector.makeConnection();
       String sql="select * from paidaccount where owner_id="+pm.getOwnerID()+"";
       ResultSet resultSet=DBManager.getData(connection, sql);
       return resultSet;
   }
   
}
    

