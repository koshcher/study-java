package ua.step.example.part3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.example.part3.performer.PerformanceException;
import ua.step.example.part3.performer.Performer;

/**
 * Давид - может играть одновременно на нескольких инструментах.  
 * Внедрение объектов в список
 */
public class Task04 {
	public static void main(String[] args) throws PerformanceException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");
		Performer performer = context.getBean("david", Performer.class);
		performer.perform();
		context.close();
		// FIXME добавь Дэвиду саксофон, для выступления
	}
}