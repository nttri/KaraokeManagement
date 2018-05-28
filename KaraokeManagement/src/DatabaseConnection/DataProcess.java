package DatabaseConnection;

import java.sql.CallableStatement;
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
    CallableStatement g_CallableStatement;
    
    public DataProcess(){
        g_ConnectDB = new DBConnect();
        g_Connection = g_ConnectDB.getConnectToSQLServer();
        try {
            g_Statement = g_Connection.createStatement();
        } catch (SQLException ex) {
        };
    }
    
    public ResultSet fetchData(String sql){
        ResultSet res = null;
        
        if(sql.endsWith(")")){          // Trường hợp lấy data có điều kiện
            sql = "{call " + sql + "}";
            try {
                g_CallableStatement = g_Connection.prepareCall(sql);
                res = g_CallableStatement.executeQuery();
            } catch (SQLException ex) {}
        }else{                          // Trường hợp lấy data không có điều kiện
            try {
                res = g_Statement.executeQuery(sql);
            } catch (SQLException ex) {}
        }
        return res;
    }
    
    public boolean Execute(String sql){
        try {
            //g_Statement.executeQuery(sql);
            sql = "{call " + sql + "}";
            g_CallableStatement = g_Connection.prepareCall(sql);
            g_CallableStatement.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public void disconnect(){
        g_ConnectDB.closeConnection();
    }
}
