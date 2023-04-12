package ua.step.example.part3.performer;

public class Guitar implements Instrument {

	@Override
	public void play(Instrumentalist instrumentalist) {
		System.out.println("Брынди-брынди-балалайка");
	}

	@Override
	public String getLastUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
