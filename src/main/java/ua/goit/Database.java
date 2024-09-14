package ua.goit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Database {

    private static Database instance;



    private Database(){
    }

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }


    public static Connection getConnection() throws SQLException {
        String db_url = "jdbc:postgresql://localhost:5438/test_database";
        String db_user = "Rush";
        String db_password = "rush";
        return DriverManager.getConnection(db_url,db_user,db_password);
    }
}
