package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * 
 * Внедерения используя Spring
 *
 */
public class Task00 {
	public static void main(String[] args) throws PerformanceException {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"))
		{
			Performer performer = context.getBean("duke", Performer.class);
			performer.perform();
		}
		// FIXME исправь конфигурацию в spring.xml таким образом чтобы Дюк жонглировал 15 шарами
		// Подсказка: Используй внедрение через конструктор
		
		// FIXME исправь конфигурацию в spring.xml таким образом чтобы Дюк читал Сонату 29 во время жонглировагния
		// Подсказка: Используй класс PoeticJuggler и Sonnet29 
	}
}