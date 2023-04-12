package ua.step.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ua.step.jdbc.utils.ConnectionUrl;

/**
 * 
 * Обнавление данных в таблице
 *
 */
public class Task10 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUrl.getConnection();
		// FIXME удалите комментарии который содержат не цензурные выражения
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(
				"SELECT * FROM USERS u JOIN Comments c ON u.id = c.id_user");
		while (resultSet.next()) {
			System.out.println("Коммент " + resultSet.getShort("login") + " " + resultSet.getString("comment"));

		}
	}
}