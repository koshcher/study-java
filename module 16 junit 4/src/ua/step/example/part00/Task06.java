package ua.step.example.part00;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * 
 * Использование проверок для ссылочных типов
 *
 */
@SuppressWarnings("unused")
public class Task06 {
	public int[] getMas() {
		return new int[] { 1, 2, 3 };
	}

	@Test
	public void testEquals() {
		int[] mas1 = getMas();
		int[] mas2 = getMas();
		// сравнивает содержимое строк вызывая метод equals у строк
		assertEquals("Нельзя применять для массивов", mas1, mas2);

		// assertArrayEquals(mas1, mas2);

		// FIXME исправь работу теста заменив assertEquals на assertArrayEquals
	}
}