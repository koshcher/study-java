package ua.step.example.part00;

// статический импорт
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 * Состояние теста Игнорирование тестового метода
 *
 */
public class Task09 {
	@SuppressWarnings("null")
	@Test
	public void testErrorMethod() {
		String s = null;
		assertEquals("abc", s.trim());
	}

	@Ignore("Причина игнорирования")
	@Test
	public void testIgnoredMethod() {
		fail("Игнорируемый");
	}

	@Test
	public void testFailMethod() {
		fail("Упавший");
	}

	@Test
	public void testPassedMethod() {
		// не упавший
	}
}