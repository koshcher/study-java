package ua.step.example.part00;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Использование проверок для ссылочных типов на null
 */
public class Task07 {
	public String get(int number) {
		if (number > 0) {
			return String.valueOf(number);
		}
		return null;
	}

	@Test
	public void testNull() {
		String s1 = get(-1);
		// проверяет утверждение, что ссылка null
		assertNull(s1);
	}

	@Test
	public void testNotNull() {
		String s1 = get(1);
		// проверяет утверждение, что ссылка НЕ рвна null
		assertNotNull(s1);
	}
}