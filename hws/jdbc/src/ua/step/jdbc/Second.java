package ua.step.jdbc;

import ua.step.jdbc.utils.ConnectionUrl;
import ua.step.jdbc.utils.Query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Consumer;

public class Second {


    public static void show1(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            for (int i = 1; i < 8; i++) {
                System.out.print(resultSet.getString(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void show2(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            System.out.println(name);
        }
    }

    public static void show3(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int numberOfCars = resultSet.getInt("number");
            System.out.println(name + ": " + numberOfCars);
        }
    }


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String query1 = "SELECT * FROM CARS";
        String query2 = "SELECT name FROM CARS";
        String query3 = "SELECT name, COUNT(id) as number FROM CARS GROUP BY name";

        try  {
            show1(Query.run(query1));
            show2(Query.run(query2));
            show3(Query.run(query3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
