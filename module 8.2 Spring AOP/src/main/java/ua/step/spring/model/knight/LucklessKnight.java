package ua.step.spring.model.knight;

/**
 * Не очень везучий рыцарь 
 *
 */
public class LucklessKnight implements Knight {
	public void embarkOnQuest() throws QuestException {
		System.out.println("Рыцарь: подскальзывается и падает в яму с ядовитыми змеями");
		System.out.println("... и с шипами");
		System.out.println("... и заполненную кислотой");
		throw new QuestException("Тело повреждено ядом и кислотой, множественные колотые раны."); // бросаем исключительную ситуацию
	}
}
