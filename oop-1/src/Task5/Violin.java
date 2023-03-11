package Task5;

public class Violin extends MusicalInstrument {
    public Violin() {
        super("Violin", 1920);
    }

    @Override
    public void Sound() {
        System.out.println("uiiiuuuuiiiiuuuuiiiuuuii");
    }


    @Override
    public void Desc() {
        System.out.println("Violin is Скрипка");
    }

    @Override
    public void History() {
        System.out.println("The violin was first known in 16th-century Italy, with some further modifications occurring in the 18th and 19th centuries to give the instrument a more powerful sound and projection. In Europe, it served as the basis for the development of other stringed instruments used in Western classical music, such as the viola.");
    }
}
