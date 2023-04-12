package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * Если у нас есть несколько исполнителей которые играют одну и ту же мелодию на
 * одном и том же инструменте, используя абстрактный бин
 *
 */
public class Task05 {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
		
		Performer performer = context.getBean("kenny", Performer.class);
		performer.perform();

		performer = context.getBean("black", Performer.class);
		performer.perform();
		
		performer = context.getBean("suzan", Performer.class);
		performer.perform();
		
		context.close();
		
		// FIXME  Организуй выступление Кайла, Давида и Франка
	}
}