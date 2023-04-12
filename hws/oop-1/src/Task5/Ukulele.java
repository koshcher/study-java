package Task5;

public class Ukulele extends MusicalInstrument {
    public Ukulele() {
        super("Ukulele", 1880);
    }

    @Override
    public void Sound() {
        System.out.println("drin drin driiiin");
    }


    @Override
    public void Desc() {
        System.out.println("Ukulele is Укулеле");
    }

    @Override
    public void History() {
        System.out.println("Developed in the 1880s, the ukulele is based on several small, guitar-like instruments of Portuguese origin, the machete, cavaquinho, timple, and rajão, introduced to the Hawaiian Islands by Portuguese immigrants from Madeira, the Azores and Cape Verde.");
    }
}
