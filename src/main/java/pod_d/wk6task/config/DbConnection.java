package pod_d.wk6task.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
    //Creating database Connection in java online shopping system
    public static Connection connection;

    // Creating universal method to open connect will mysql database
    public static Connection getConnection() {
        try {
            //Registering with mysql Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingsystem?useSSL=false", "root", "ICEmili234!@");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (connection);
    }

    // Creating universal method to close connect will mysql database
    public static void CloseConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Creating universal method to query for retrieving information
    public static ResultSet getResultFromSqlQuery(String SqlQueryString) {
        //Creating Resultset object
        ResultSet rs = null;
        try {
            //Checking whether the connection is null or null
            if (connection == null) {
                getConnection();
            } //Querying the query rs = connection.creat
            rs = connection.createStatement().executeQuery(SqlQueryString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    //Creating universal method to query for inserting or updating information in mysql database
    public static int insertUpdateFromSqlQuery(String SqlQueryString) {
        int i = 2;
        try {
            //Checking whether the connection is null or null
            if (connection == null) {
                getConnection();
            }
            //Querying the query
            i = connection.createStatement().executeUpdate(SqlQueryString);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return i;
    }
}
