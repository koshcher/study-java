package ua.step.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.step.beans.Employee;

/**
 * Сервлет загружается при старте приложения
 */
@WebServlet(urlPatterns = "/employees", loadOnStartup = 1)
public class EmployeesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> employees = new ArrayList<>();
		request.setAttribute("employees", employees);
		// Создать объект RequestDispatcher
		// чтобы forward (перенаправить) запрос к странице task017.jsp
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/task17.jsp");

		// Forward (Перенаправить) запрос, чтобы отобразить страницу JSP.
		dispatcher.forward(request, response);
	}
}
