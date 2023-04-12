package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * 
 * Внедерения используя Spring
 *
 */
public class Task01 {
	public static void main(String[] args) throws PerformanceException {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/spring1.xml")){
			Performer performer = context.getBean("kenny", Performer.class);
			performer.perform();

		}
		// FIXME исправь spring1.xml таким образом, чтобы Кенни играл Jingle Bells на саксафоне
	}
}