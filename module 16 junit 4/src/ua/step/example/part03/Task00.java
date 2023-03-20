package ua.step.example.part03;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * Практическое задание 1
 *
 */
@RunWith(Parameterized.class)
public class Task00 {
	/***************************************************************************
	 * Метод calc производит целочисленные арифметические операции над входными
	 * значениями из переменных value1 и value2. Тип операции задается символом в
	 * переменной operator. Метод возврашает результат вычисления операции.
	 *
	 */
	public int calc(int value1, int value2, char operator) {
		switch (operator) {
		case '+':
			return value2 + value1;
		case '-':
			return value1 - value2;
		case '*':
			return value2 * value1;
		case '/':
			return value2 / value2;
		}
		// бросание исключительной ситуации
		throw new InvalidParameterException("Неверная операция");
	}
 
	// помечает метод который будет возвршать набор данных для тесирования
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 0,'+', 0, 0 },
			{ -1,'+', 1, 0 },
			{ 1,'+', -1, 0 },
			{ 0,'*', 0, 0 },
			{ -1,'*', 1, -1 },
			{ 2,'*', -1, -2 },
			{ 2,'-', -1, 3 },
			{ 1,'-', 2, -1 },
		});
	}

	private int value1;
	private char operator;
	private int value2;
	private int result;

	public Task00(int value1, char operator, int value2, int result) {
		this.value1 = value1;
		this.value2 = value2;
		this.operator = operator;
		this.result = result;
	}
	
	@Test
	public void test() {
		assertEquals(String.format("%d%s%d=%d", value1, operator, value2, result),
				calc(value1, value2, operator), result);
	}
	// FIXME Напиши необхадимые тестирующие методы для всех операций данного метода.
	// На основании результатов тестов, исправь ошибки в методе.
}