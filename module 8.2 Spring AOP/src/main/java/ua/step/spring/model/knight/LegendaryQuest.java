package ua.step.spring.model.knight;

import org.springframework.stereotype.Component;

@Component("normal")
public class LegendaryQuest implements Quest {

	public int embark(String name) {
		System.out.println("Убил принцессу");
		System.out.println("Женился на драконе");
		return 10;
	}
}