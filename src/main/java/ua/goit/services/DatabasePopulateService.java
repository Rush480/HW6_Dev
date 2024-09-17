package ua.goit.services;

import ua.goit.util.Database;
import ua.goit.util.FileReader;

import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) {

        String populateScript = new FileReader().readFile(Path.of("sql/populate_db.sql"));

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
             statement.execute(populateScript);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to execute SQL script",e);
        }

    }
}

