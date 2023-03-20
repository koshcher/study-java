package ua.step.example.part00;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Использование тестовых методов для оценки максимального времени работы метода
 *
 */
public class Task08 {
	public String getNumbersLong(int number) {
		String string = "";
		int count = 0;
		while (string.length() < number) {
			string += count++;
		}
		if (string.length() > number) {
			string = string.substring(0, 1000);
		}
		return string;
	}

	public String getNumbersFast(int number) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (sb.length() < number) {
			sb.append(count++);
		}
		if (sb.length() > number) {
			sb.delete(number - 1, sb.length() - 1);
		}
		return sb.toString();
	}

	@Test(timeout = 1)
	public void testLong() {
		int n = 10000;
		String value = getNumbersLong(n);
		assertEquals(n, value.length());
	}

	@Test(timeout = 1)
	public void testFast() {
		int n = 10000;
		String value = getNumbersFast(n);
		assertEquals(n, value.length());
	}
}