package ua.step.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * Регистрация драйвера
 *
 */
public class Task01 {
	public static void main(String[] args) {

		// первый способ инициализации драйвера
		try {
			// указывается полное имя класса
			Class.forName("org.sqlite.JDBC");
			System.out.println("Драйвер зарегестрирован");
		} catch (ClassNotFoundException e) {
			// будет брощено исключение если данный класс будет отсуствовать в подключеных библиотеках
			e.printStackTrace();
		}
		// второй способ
		try {
			DriverManager.registerDriver(new org.sqlite.JDBC());
			System.out.println("Драйвер зарегестрирован");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}