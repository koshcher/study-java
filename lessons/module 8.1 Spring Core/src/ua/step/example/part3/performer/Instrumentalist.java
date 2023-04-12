package ua.step.example.part3.performer;

public class Instrumentalist implements Performer {
	private Instrument instrument;
	private String song;
	private String name = "Аноним";

	public Instrumentalist() {
	}

	public Instrumentalist(String name) {
		this.name = name;
	}

	public void perform() throws PerformanceException {
		if (instrument != null) {
			if (song == null) {
				System.out.println("Инструмент есть, а что играть?");
			} else if (instrument.getLastUser() != null) {
				System.out.println("Инструмент уже использовался " + instrument.getLastUser()
						+ ". Я отказываюсь играть на нем. Дайте мне новый");
			} else {
				System.out.print(name + " играет " + song + " : ");
				instrument.play(this);
			}
		} else {
			System.out.println(name + " говорит нет инструмента, нет и музыки");
		}
	}

	public void setSong(String song) { // Внедрение мелодии
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	public void setInstrument(Instrument instrument) { // Внедрение
		this.instrument = instrument; // инструмента
	}

	public String getName() {
		return name;
	}
}
