package dev.rk.servlet1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculatorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/calculator.jsp").forward(request, response);
	}

	/*
		Пользователь вводит в текстовое поле текст. Сервлет
		анализирует полученные данные и отображает статистику
		по тексту: количество гласных, список гласных, количество
		согласных, список согласных, количество знаков препинания, список знаков препинания.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String expression = request.getParameter("expression").toLowerCase();
		var result = Calculator.eval(expression);

		request.setAttribute("result", result);
		request.getRequestDispatcher("/calculator.jsp").forward(request, response);
	}
}
