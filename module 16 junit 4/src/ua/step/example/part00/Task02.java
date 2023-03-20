package ua.step.example.part00;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Тестирование времени работы метода.
 *
 */
public class Task02 {
	/**
	 * Тестируемый метод
	 */
	public String concatNumber(int start, int end) {
		// FIXME исправь метод чтобы он проходил тест
		String result = "";
		for (int i = start; i <= end; i++) {
			result += i + ",";
		}
		return result;
	}

	/**
	 * Тестирующий метод проверяет результат, а так же чтобы метод выполнялся не
	 * дольше 1 милисекунды.
	 */
	@Test(timeout = 1) // время работы метода не должно превышать 1 милисекунду
	public void testTimeout() {
		// подготовка входных данных
		int value1 = 1;
		int value2 = 27;
		// вызов тестируемого метода и получение результата
		String result = concatNumber(value1, value2);

		// ожидаемый результат
		String exepted = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27";
		// проверка утверждения
		assertEquals("Текс ошибки", exepted, result);
	}
}