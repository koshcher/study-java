package ua.step.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.step.spring.model.knight.Knight;
import ua.step.spring.model.knight.QuestException;

/**
 * Рыцарь умеет выполнять (embarkOnQuest) поручения Quest
 * @see ua.step.spring.model.knight.Knight
 * @see ua.step.spring.model.knight.Quest
 * @see ua.step.spring.model.knight.BraveKnight
 */
public class Task01 {
	public static void main(String[] args) throws QuestException {
		// Загрузка контекста Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights1.xml");
		// Получение компонента knight
		Knight knight = context.getBean("knight", Knight.class);
		// Использование компонента knight
		knight.embarkOnQuest();
		context.close();
		// FIXME создай свое приключение для бравого рыцаря
	}
}