package ua.step.example.part3.performer;

public class Saxophone implements Instrument {

	private String lastUse;

	public Saxophone() {
	}

	public void play(Instrumentalist instrumentalist) {
		lastUse = instrumentalist.getName();
		System.out.println("TOOT TOOT TOOT");
	}

	@Override
	public String getLastUser() {
		return lastUse;
	}
}
