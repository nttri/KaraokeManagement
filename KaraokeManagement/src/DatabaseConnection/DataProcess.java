package DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanhtri
 */
public class DataProcess {
   
    DBConnect g_ConnectDB;
    Connection g_Connection;
    Statement g_Statement;
    
    public DataProcess(){
        g_ConnectDB = new DBConnect();
        g_Connection = g_ConnectDB.getConnectToSQLServer();
        try {
            g_Statement = g_Connection.createStatement();
        } catch (SQLException ex) {
        }
        System.out.println("Haha");
    }
    
    public ResultSet fetchData(String sql){
        ResultSet res = null;
        try {
            res = g_Statement.executeQuery(sql);
        } catch (SQLException ex) {
        }
        return res;
    }
    
    public boolean Execute(String sql){
        try {
            g_Statement.executeQuery(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public void disconnect(){
        g_ConnectDB.closeConnection();
    }
}
