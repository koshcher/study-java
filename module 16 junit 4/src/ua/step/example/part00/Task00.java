package ua.step.example.part00;

/**
 *  статический импорт метода fail из класса Assert
 */
import static org.junit.Assert.*;

import org.junit.Test;


/**
 *
 * Тестовый класс и тестовый метод
 */
public class Task00 {
	@Test // обязательная аннотацией
	// метод должен быть public и не возвращать и не принимать параметров
	public void testMethod() {
		System.out.println("Тестовый метод запущен");
		fail("Текст ошибки на случай провала теста");
		// FIXME закоментируй строчку 22 чтобы тест прошел
	}
}