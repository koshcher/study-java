package ua.step.example.part3.performer;

public class Piano implements Instrument {

	private String lastUse;

	public Piano() {
	}

	public void play(Instrumentalist instrumentalist) {
		lastUse = instrumentalist.getName();
		System.out.println("OUUTU OUON OUN");
	}

	@Override
	public String getLastUser() {
		return lastUse;
	}
}
