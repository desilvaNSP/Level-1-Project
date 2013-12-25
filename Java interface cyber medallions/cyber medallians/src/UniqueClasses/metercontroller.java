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
public class metercontroller {
   public static int addmeter(Metermodel mm) throws SQLException, ClassNotFoundException{
        Connection connection=DatabaseConnector.makeConnection();
        String sql="Insert into meter values('"+mm.getMeterID()+"','"+mm.getMeterNo()+"','"+mm.getRpu()+"','"+mm.getConnectedDate()+"','"+mm.getMadeIn()+"','"+mm.getOwnerID()+"')";
        int state=DBManager.SendData(connection, sql);
        return state;
   }
   public static ResultSet searchMeterByMeterNo(Metermodel mm) throws SQLException, ClassNotFoundException{
       Connection connection=DatabaseConnector.makeConnection();
       String sql="select * from meter where meter_no='"+mm.getMeterNo()+"'";
       ResultSet resultSet=DBManager.getData(connection, sql);
       return resultSet;
   }
    public static ResultSet searchMeterByMeterId(Metermodel mm) throws SQLException, ClassNotFoundException{
       Connection connection=DatabaseConnector.makeConnection();
       String sql="select * from meter where meter_id='"+mm.getMeterID()+"'";
       ResultSet resultSet=DBManager.getData(connection, sql);
       return resultSet;
   }
    public static int updateMeter(Metermodel mm) throws SQLException, ClassNotFoundException{
        Connection connection=DatabaseConnector.makeConnection();
        String sql="UPDATE METER SET meter_no='"+mm.getMeterNo()+"',rpu='"+mm.getRpu()+"',made_in='"+mm.getMadeIn()+"',connected_date='"+mm.getConnectedDate()+"' where meter_id='"+mm.getMeterID()+"'";
        int state=DBManager.SendData(connection, sql);
        return state;
    }
}