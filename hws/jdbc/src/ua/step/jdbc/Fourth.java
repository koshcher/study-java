package ua.step.jdbc;

import ua.step.jdbc.utils.ConnectionUrl;
import ua.step.jdbc.utils.Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Fourth {

    private static void showQueryResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            for (int i = 1; i < 8; i++) {
                System.out.print(resultSet.getString(i));
                System.out.print(" ");
            }
            //System.out.println(resultSet.getString(1));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<String> queries = new ArrayList<String>() {{
            add("SELECT * FROM CARS WHERE name = 'BMW'");
            add("SELECT * FROM CARS WHERE color = 'black'");
            add("SELECT * FROM CARS WHERE capacity > 1.0");
            add("SELECT * FROM CARS WHERE type = 'sedan'");
        }};

        try {
            for (String query: queries) {
                showQueryResult(Query.run(query));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
