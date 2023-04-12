package ua.step.example.part01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * Подготовка и уничтожение данных для тестовых методов
 *
 */
public class Task02 {
	static int[] mas = null;

	// метод выполняется перед выполнением всех тестовых методов этого класса
	@BeforeClass
	public static void begin() // должен быть static
	{
		mas = new int[] { 1, 2, 3 };
		System.out.println("BEFORE");
	}

	public void test(int[] mas) {
		System.out.println("TEST");
	}

	@Test
	public void testMethod1() {
		System.out.println("test 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("test 2");
	}

	// метод выполняется после выполнения всех тестовых методов этого класса
	@AfterClass
	public static void end() // должен быть static
	{
		mas = null;
		System.out.println("AFTER");
	}
}