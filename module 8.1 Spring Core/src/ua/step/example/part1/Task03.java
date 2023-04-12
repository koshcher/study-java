package ua.step.example.part1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.model.MessageBean;

/**
 * 
 * События в конексте Spring 
 *
 */
public class Task03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");

		// Событие старта
		context.start();

		MessageBean obj = (MessageBean) context.getBean("helloWorld");
		obj.getMessage();

		// событие окончания
		context.stop();
		context.close();
	}
}