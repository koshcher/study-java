package ua.step.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Сервлет объявленный с использование аннотации.
 */
@WebServlet("/user")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("userName");
		String sex = request.getParameter("sex");
		PrintWriter writer = response.getWriter();
		writer.append("Hello ");
		writer.append(sex + " ");
		writer.append(user);
		// Hell mr Name
		// Hell ms Name
	}
}