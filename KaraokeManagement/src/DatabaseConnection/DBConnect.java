package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thanhtri - 1512605
 */
public class DBConnect {

    Connection conn;

    public Connection getConnectToSQLServer() {

        ReadPropertiesLibrary propertiesLibrary = new ReadPropertiesLibrary();
        Properties properties = propertiesLibrary.readFileProperties();

        String serverName = properties.getProperty("servername");     // tên server của MSSQL
        String port = properties.getProperty("port");                 // tên port
        String dbName = properties.getProperty("databasename");       // tên DB
        String userName = properties.getProperty("username");         // tên user
        String password = properties.getProperty("password");         // password

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
        }

        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://" + serverName + ":" + port + ";databaseName=" + dbName +";user=" + userName + ";password=" + password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Kết nối MSSQL Server bị lỗi!");
        }
        return conn;
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
            conn = null;
        }
    }
}
