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
public class ConsumerController {

    public static int addConsumer(ConsumerModel cm) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnector.makeConnection();
        String sql = "Insert into consumer values('" + cm.getOwnerID() + "','" + cm.getName() + "','" + cm.getNic() + "','" + cm.getHomeNo() + "','" + cm.getStreet() + "','" + cm.getHomeTown() + "','" + cm.getMainCity() + "','" + cm.getTlpNo() + "')";
        int state = DBManager.SendData(connection, sql);
        return state;

    }

    public static ResultSet cusSearchByNIC(ConsumerModel cm) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnector.makeConnection();
        String sql = "select * from consumer where nic='" + cm.getNic() + "'";
        ResultSet resultSet = DBManager.getData(connection, sql);
        return resultSet;
    }

    public static ResultSet cusSearchByName(ConsumerModel cm) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnector.makeConnection();
        String sql = "select * from consumer where name='" + cm.getName() + "'";
        ResultSet resultSet = DBManager.getData(connection, sql);
        return resultSet;
    }

    public static ResultSet cusSearchByRegno(ConsumerModel cm) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnector.makeConnection();
        String sql = "select * from consumer where owner_id='" + cm.getOwnerID() + "'";
        ResultSet resultSet = DBManager.getData(connection, sql);
        return resultSet;
    }

    public static int updateConsumer(ConsumerModel cm) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnector.makeConnection();
        String sql = "update consumer set name='" + cm.getName() + "',NIC='" + cm.getNic() + "',homeNo='" + cm.getHomeNo() + "',street='" + cm.getStreet() + "',hometown='" + cm.getHomeTown() + "',maincity='" + cm.getMainCity() + "',tlpno='" + cm.getTlpNo() + "' where owner_id='" + cm.getOwnerID() + "'";
        int state = DBManager.SendData(connection, sql);
        return state;
    }
    public static int deleteConsumer(ConsumerModel cm) throws SQLException, ClassNotFoundException{
         Connection connection = DatabaseConnector.makeConnection();
        String sql = "delete from consumer where owner_id='"+cm.getOwnerID()+"'";
        int state = DBManager.SendData(connection, sql);
        return state;
    }
    
}