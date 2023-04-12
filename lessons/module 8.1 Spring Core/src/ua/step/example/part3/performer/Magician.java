package ua.step.example.part3.performer;

/**
 *  Волшебный ящик
 * 
 */
public class Magician implements Performer {
	private MagicBox magicBox;

	public Magician() {
	}

	public void perform() throws PerformanceException {
		System.out.println("Фокусник говорит: " + magicWords);
		System.out.println("Магический ящик содержит...");
		System.out.println(magicBox.getContents()); // Исследует содержимое
	} 
	// ящика внедрение
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox; // Внедрение волшебного ящика
	}

	private String magicWords;

	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}
}