package ua.step.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import ua.step.jdbc.utils.ConnectionUrl;

public class Task12 {
	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionUrl.getConnection();
		ResultSet resultSet = connection.getMetaData().getTables(null, null, "%", null);
		while (resultSet.next()) {
			for (int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) {
				System.out.print(resultSet.getString(i)+ " ");
			}
			System.out.println();
		}
	}
}
