package ua.step.example.part3.performer;

import org.springframework.stereotype.Component;

@Component
public class Drum implements Instrument {
	@Override
	public void play(Instrumentalist instrumentalist) {
		System.out.println("Бум-бум-бамц.");
	}

	@Override
	public String getLastUser() {
		// TODO Auto-generated method stub
		return null;
	}
}