package ua.step.example.part03;

/**
 * 
 * Практическое задание 2
 *
 */
public class Task01 {
	/**
	 * Метод getSortedUpperCase должен возвращать строку, в которой находятся только
	 * символы в верхнем регистре из исходной строки. Символы в результирующей
	 * строке должны быть отсортированны в обратном порядке (от Z до A). Если
	 * символы в верхнем регистре отсутствуют, должна возвращаться пустая строка.
	 */
	public String getSortedUpperCase(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			if (Character.isUpperCase(symbol)) {
				sb.append(symbol);
			}
		}
		return sb.toString();
	}

	// FIXME Напиши необходимые тестовые методы для всех операций данного метода.
	// На основании результата тестов, исправь метод getSortedUpperCase.
}