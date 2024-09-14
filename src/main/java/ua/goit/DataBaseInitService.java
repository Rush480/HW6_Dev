package ua.goit;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBaseInitService {
    public static void main(String[] args) throws SQLException {
        Connection connection = Database.getInstance().getConnection();
    }
}
