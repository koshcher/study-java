package ua.step.example.part2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import ua.step.example.part2.printer.MessagePrinter;
import ua.step.example.part2.printer.MessageService;

/**
 * 
 * События в контексте Spring
 *
 */
@Configuration
// аннотация @ComponentScan дает команду ядру Spring искать во всех пакетах относительно
// текущего класса, спринг бины
@ComponentScan
public class Task00 {
	/**
	 * 
	 * Регистрация Spring бина
	 */
	@Bean(name = "ms") // если имя бина не указывается, то оно будет соотвествовать имени метода
	@Description("Текстовое описание бина ms")
	MessageService getMessageService() {
		return () -> "Print hello World!";
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Task00.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		context.close();
	}
}