package ua.step.example.part1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.model.MessageBean;

/**
 * 
 * Создания бина используя java конфигурацию в Spring
 *
 */
public class Task01 {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/Beans.xml")) {
			MessageBean obj = context.getBean(MessageBean.class, "helloWorld");
			obj.getMessage();
		}
		// FIXME Измени файл Beans.xml чтобы данный код выводил Your Message : Change value is 1
	}
}