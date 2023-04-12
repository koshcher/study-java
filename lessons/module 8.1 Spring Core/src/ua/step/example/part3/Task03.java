package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * 
 * Чтобы помочь Кенни избежать заражения чужими микробами от чужих саксофонов,
 * мы воспользуемся технологией Spring, известной как внутренние компоненты.
 * Создавая объект бина Саксофон, перед использованием
 */
public class Task03 {
	public static void main(String[] args) throws PerformanceException {
		try(ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("file:src/spring3.xml")){
			
			Performer performer1 = context.getBean("sten", Performer.class);
			performer1.perform();

			Performer performer2 = context.getBean("erik", Performer.class);
			performer2.perform();
			
			// FIXME Помоги Эрику сыграть на саксафоне после Стэна
		}
	}
}