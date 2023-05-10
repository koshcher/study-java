package ua.step.jdbc;

import ua.step.jdbc.utils.ConnectionUrl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Third {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String query1 = "SELECT name FROM Cars GROUP BY name ORDER BY COUNT(*) ASC LIMIT 1";
        String query2 = "SELECT name FROM Cars GROUP BY name ORDER BY COUNT(*) DESC LIMIT 1";
        String query3 = "SELECT * FROM CARS WHERE year = 2000";
        String query4 = "SELECT * FROM CARS WHERE year BETWEEN 2002 AND 20011";

        try (Connection connection = ConnectionUrl.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query1);
        ) {
            while (resultSet.next()) {
                /*
                    for (int i = 1; i < 8; i++) {
                        System.out.print(resultSet.getString(i));
                        System.out.print(" ");
                    }
                 */
                System.out.println(resultSet.getString(1));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
