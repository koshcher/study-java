package Task5;

abstract class MusicalInstrument {
    private final String name;
    private final int year;

    protected MusicalInstrument(String name, int year) {
        this.name = name;
        this.year = year;
    }

    abstract public void Sound();

    public void Show() {
        System.out.println(name);
    }

    abstract public void Desc();

    abstract public void History();
}
