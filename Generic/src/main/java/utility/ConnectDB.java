package utility;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

/**
 * Created by ahoura on 1/27/17.
 */
public class ConnectDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://Ahourawb:3306/";
        String dbName = "myDB21";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "mySuperSecretPassword\n";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url+dbName,userName,password);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

