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
public class hastopayController {
    public static ResultSet getAccountDetails(String accNo) throws SQLException, ClassNotFoundException{
        Connection con=DatabaseConnector.makeConnection();
        ResultSet rst=null;
        String sql="select * from hastopay where account_no='"+accNo+"' ";
        rst=DBManager.getData(con, sql);
        return rst;
    }
 
}
