package ua.step.example.part3.performer;

import java.util.Collection;

public class OneManBand extends Instrumentalist implements Performer {

	private Collection<Instrument> instruments;

	public OneManBand() {
		super("Человек оркестр");
	}

	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play(this);
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments; // Внедрение коллекции инструментов
	}
}