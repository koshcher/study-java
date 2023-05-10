package ua.step.jdbc;

import ua.step.jdbc.utils.ConnectionUrl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Fifth {

    public static String insertMutationSql() {
        String name = "BMW";
        String model = "5151";
        double capacity = 1.4;
        int year = 2003;
        String color = "black";
        String type = "sedan";

        return String.format(
                "INSERT INTO Cars (name, model, capacity, year, color, type) VALUES ('%s', '%s', '%f', '%d', '%s', '%s')",
                name, model, capacity, year, color, type
        );
    }

    public static String deleteMutationSql() {
        int id = 4;
        return String.format("DELETE FROM Cars WHERE id = '%d'", id);
    }

    public static String updateMutationSql() {
        int id = 4;
        int yearToUpdate = 2012;
        return String.format("UPDATE Cars SET year = '%d' WHERE id = '%d'", yearToUpdate, id);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        List<String> mutations = new ArrayList<String>() {{
            add(insertMutationSql());
            add(deleteMutationSql());
            add(updateMutationSql());
        }};

        try (Connection connection = ConnectionUrl.getConnection()) {

            for (String mutation: mutations) {
                Statement statement = connection.createStatement();
                System.out.println(mutation);
                statement.execute(mutation);
                System.out.println("Saved");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
