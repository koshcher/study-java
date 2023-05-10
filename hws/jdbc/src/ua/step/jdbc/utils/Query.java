package ua.step.jdbc.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    public static ResultSet run(String query) throws SQLException {
        Connection connection = ConnectionUrl.getConnection();
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }
}
