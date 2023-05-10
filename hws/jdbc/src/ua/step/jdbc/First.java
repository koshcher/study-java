package ua.step.jdbc;

import ua.step.jdbc.utils.ConnectionUrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");

        String sql = "CREATE TABLE if not exists 'cars' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'model' text, 'capacity' real, 'year' integer, 'color' text, 'type' text);";

        try (Connection connection = DriverManager.getConnection(ConnectionUrl.URL)) {

            System.out.println(connection.getMetaData().getURL());
            Statement statement = connection.createStatement();
            statement.execute(sql);
            System.out.println("Table cars created");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

