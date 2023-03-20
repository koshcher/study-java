package ua.step.example.part00;

import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * 
 * Проверка корректности работы метода, используя тестовый метод.
 *
 */
public class Task01 {
	/**
	 * Тестируемый метод. Метод должен возвращать сумму входных параметров
	 */
	public int sum(int value1, int value2) {
		// FIXME исправь код метода таким образом, чтобы тест проходил.
		return value1 + value2 + 1;
	}

//------------------------------------------------------
	/**
	 * Тестирующий метод
	 */
	@Test
	public void testMethod() {
		// подготовка входных данных
		final int value1 = 2;
		final int value2 = 2;

		// вызов тестируемого метода и получение фактического результата
		int actual = sum(value1, value2);

		// ожидаемый резульатат работы метода
		final int exepted = 4;
		// проверка утверждения (статический метод класса Assert)
		assertSame("Неверная сумма, результат должен быть равен 4", exepted, actual);
	}
}