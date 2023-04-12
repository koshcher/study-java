package ua.step.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ua.step.jdbc.utils.ConnectionUrl;

/**
 * 
 * Чтение данных из результата запроса
 *
 */
public class Task05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try (Connection connection = ConnectionUrl.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
			) {
			
			// получения курсора для запроса
			
			while (resultSet.next()) {
				// получает данные из второго столбца в запросе
				System.out.print(resultSet.getString(3));
				System.out.print(" ");
				// получает данные из столбца с именем login
				System.out.print(resultSet.getString("login"));
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}