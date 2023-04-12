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
public class Task09 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUrl.getConnection();
		// FIXME выведите все комментарии пользователей
		// FIXME выведите комментарии пользователей которые содержать слово like
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Users WHERE login = 111 AND password = 'admin'");
		if (resultSet.next()) {
			System.out.println("Успещно");
			statement.executeUpdate(
					"INSERT INTO Comments (id_user, comment) VALUES(" + resultSet.getInt(1) + ", \"dfdsfdsf\")");
		} else {
			System.out.println("Нет доступа");
		}
	}
}