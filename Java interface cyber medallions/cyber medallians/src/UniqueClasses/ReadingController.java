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
public class ReadingController {
  public static int addReading(ReadingModel rm) throws SQLException, ClassNotFoundException{
        Connection connection=DatabaseConnector.makeConnection();
        String sql="Insert into reading values('"+rm.getReading_id()+"','"+rm.getDates()+"','"+rm.getTimes()+"','"+rm.getUnits()+"','"+rm.getNo_of_dates()+"','"+rm.getMonths()+"','"+rm.getMeter_id()+"')";
        int state=DBManager.SendData(connection, sql);
        return state;
   }
   public static ResultSet searchreadingByMeterID(ReadingModel rm) throws SQLException, ClassNotFoundException{
       Connection connection=DatabaseConnector.makeConnection();
       String sql="select * from reading where meter_id='"+rm.getMeter_id()+"'";
       ResultSet resultSet=DBManager.getData(connection, sql);
       return resultSet;
   }   
}
