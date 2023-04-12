package Task5;

public class Cello extends MusicalInstrument {
    public Cello() {
        super("Cello", 1880);
    }

    @Override
    public void Sound() {
        System.out.println("braan braan briiiin");
    }


    @Override
    public void Desc() {
        System.out.println("Cello is Виолончель");
    }

    @Override
    public void History() {
        System.out.println("The earliest cellos were developed during the 16th century and frequently were made with five strings. They served mainly to reinforce the bass line in ensembles. Only during the 17th and 18th centuries did the cello replace the bass viola da gamba as a solo instrument.");
    }
}
