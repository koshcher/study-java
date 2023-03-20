package ua.step.example.part00;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * 
 * Использование проверок на null для ссылочных типов
 *
 */
public class Task04 {
	public String getText(boolean status) {
		return status ? null : "abc";
	}

	@Test
	public void testNull() {
		String s1 = getText(true);
		assertNull(s1); // проверяет равна ли ссылка null
	}

	@Test
	public void testNotNull() {
		String s1 = getText(false);
		assertNotNull(s1); // проверяет чтобы ссылка НЕ была рвна null
	}
}