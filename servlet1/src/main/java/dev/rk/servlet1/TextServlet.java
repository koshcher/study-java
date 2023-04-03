package dev.rk.servlet1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@WebServlet("/text")
public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TextServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/text.jsp").forward(request, response);
	}

	/*
		Пользователь вводит в текстовое поле текст. Сервлет
		анализирует полученные данные и отображает статистику
		по тексту: количество гласных, список гласных, количество
		согласных, список согласных, количество знаков препинания, список знаков препинания.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String text = request.getParameter("text").toLowerCase();

		var textVowels = filter(text, vowels);
		var textConsonants =  filter(text, consonants);
		var textPunctuation =  filter(text, punctuation);

		request.setAttribute("vowels", textVowels);
		request.setAttribute("consonants", textConsonants);
		request.setAttribute("punctuations", textPunctuation);
		request.setAttribute("vowelsCount", textVowels.size());
		request.setAttribute("consonantsCount", textConsonants.size());
		request.setAttribute("punctuationsCount", textPunctuation.size());

		request.getRequestDispatcher("/text.jsp").forward(request, response);
	}

	private List<String> filter(String text, List<String> symbols) {
		return text.toLowerCase().chars().mapToObj(c -> String.valueOf((char)c)).filter(symbols::contains).collect(Collectors.toList());
	}

	private final List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
	private final List<String> consonants = Arrays.asList("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z");
	private final List<String> punctuation = Arrays.asList(".", ",", ";", ":", "!", "?", "-", "_", "/", "\\", "(", ")", "[", "]", "{", "}");
}
