package ua.step.spring.model.knight;

import org.springframework.stereotype.Component;

@Component("slaydragon")
public class SlayDragonQuest implements Quest {

	public int embark(String name) {
		System.out.println(name + " Нашел дракона");
		System.out.println(name + " Убил дракона");
		System.out.println(name + " Съел дракона");
		return 3;
	}
}