package ua.step.example.part00;

import org.junit.Test;

/**
 * 
 * Тестирование возникновения исключений
 *
 */
public class Task10 {
	/**
	 * Тестируемый метод
	 */
	public int division(int value1, int value2) {
		// тут может возникннуть исключение ArithmeticException
		return value1 / value2;
	}

	/**
	 * Тестирующий метод проверяет утверждение, что при указанных входных данных,
	 * метод бросит исключение во время выполнение программы
	 */
	@Test(expected = ArithmeticException.class)
	public void testMethod() {
		// подготовка входных данных
		int value1 = 2;
		int value2 = 0;
		// вызов тестируемого метода и получение результата
		division(value1, value2);
		// утверждение в таких методах, как правило не используется
	}
}