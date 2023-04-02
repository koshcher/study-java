package dev.rk.servlet1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

@WebServlet("/text")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TextServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/text.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			int num3 = Integer.parseInt(request.getParameter("num3"));
			String operation = request.getParameter("operation");

			int[] nums = {num1, num2, num3};

			if (Objects.equals(operation, "max")) {
				int max = Arrays.stream(nums).max().getAsInt();
				request.setAttribute("max", max);
			} else if (Objects.equals(operation, "min")) {
				int min = Arrays.stream(nums).min().getAsInt();
				request.setAttribute("min", min);
			} else if (Objects.equals(operation, "avg")) {
				double avg = Arrays.stream(nums).sum() / 3.0;
				request.setAttribute("avg", avg);
			}
		} catch (Exception ignored) { }

		request.getRequestDispatcher("/nums.jsp").forward(request, response);
	}

}
