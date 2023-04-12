package ua.step.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

import ua.step.jdbc.utils.ConnectionUrl;

/**
 * 
 * Обнавление данных в таблице
 *
 */
public class Task08 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUrl.getConnection();
		// FIXME Напишите код который позволит пользователю вводить комментарии
		// вначале пользователь вводит логи и пароль, если в базе найдено соотвествие
		// то пользователю дается возможность добавлять комментарии
	}
}