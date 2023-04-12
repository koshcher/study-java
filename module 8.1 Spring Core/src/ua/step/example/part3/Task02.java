package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * 
 * Внедерения используя Spring
 *
 */
public class Task02 {
	public static void main(String[] args) throws PerformanceException {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/spring2.xml")){
			Performer performer = context.getBean("kenny", Performer.class);
			performer.perform();
		}
		// FIXME создай spring2.xml и сконфигурируй его таким образом чтобы
		// Кенни играл на пианино "Собачий Вальс"
		// Класс Piano необходимо создать самостоятельно
	}
}