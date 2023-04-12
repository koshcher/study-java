package ua.step.example.part3.performer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * Указывает, что аннотированный класс является «компонентом Spring». Такие
 * классы рассматриваются как кандидаты на автоматическое обнаружение при
 * использовании конфигурации на основе аннотаций и сканирования пути к классам.
 *
 */
@Component
public class Automatic implements Performer {

	/**
	 * Помечает метод конструктора, поля или сеттера , который должен быть построен
	 * средствами инъекции Spring бина.
	 */
	@Autowired
	private Instrument instrument;

	@Override
	public void perform() throws PerformanceException {
		instrument.play(new Instrumentalist());
	}
}