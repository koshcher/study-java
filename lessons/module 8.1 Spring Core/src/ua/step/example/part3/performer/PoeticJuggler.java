package ua.step.example.part3.performer;

public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler(Poem poem) { // Внедрение поэмы
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBags, Poem poem) { // Внедрение количества
		super(beanBags); // мячиков и поэмы
		this.poem = poem;
	}

	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("Читая при этом...");
		poem.recite();
	}
}