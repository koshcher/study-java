package ua.step.spring.model.knight;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("knight")
public class NormalKnight implements Knight {
	private String name = "Обычный рыцарь";

	@Autowired(required = false)
	@Qualifier(value = "slaydragon")
	private Quest quest;

	@Legend
	public void embarkOnQuest() throws QuestException {
		Optional.ofNullable(quest)
			.map(q -> q.embark(name))
			.orElseThrow(() -> new QuestException("Нет приключения"));
	}
}