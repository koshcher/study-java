package ua.step.example.part1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ua.step.model.MessageBean;
import ua.step.model.MessageBeanConfig;

/**
 * Конфигурация контекста с помошью аннотаций. Контекст бина
 */
public class Task02 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MessageBeanConfig.class);
		
		// получения бина из контекста 
		MessageBean bean = ctx.getBean(MessageBean.class);
		bean.setMessage("Hello World!!!");
		bean.getMessage();
		
		// повторное получения бина из контекста
		bean = ctx.getBean(MessageBean.class);
		bean.getMessage();
		ctx.close();
		// FIXME раскоментируй аннотацию в HelloWorldConfig запусти пример заного
	}
}
/*
singleton - Определяет один единственный бин для каждого контейнера Spring IoC (используется по умолчанию).

prototype - Позволяет иметь любое количество экземпляров бина.

request - Создаётся один экземпляр бина на каждый HTTP запрос. Касается исключительно ApplicationContext.
session - Создаётся один экземпляр бина на каждую HTTP сессию. Касается исключительно ApplicationContext.
global-session - Создаётся один экземпляр бина на каждую глобальную HTTP сессию. Касается исключительно ApplicationContext.
*/