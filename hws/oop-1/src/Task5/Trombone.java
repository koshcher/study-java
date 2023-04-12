package Task5;

public class Trombone extends MusicalInstrument {
    public Trombone() {
        super("Trombone", 1689);
    }

    @Override
    public void Sound() {
        System.out.println("tutu tutu tut tu");
    }


    @Override
    public void Desc() {
        System.out.println("Trombone is Тромбон");
    }

    @Override
    public void History() {
        System.out.println("The trombone is a 15th-century development of the trumpet and, until approximately 1700, was known as the sackbut. Like a trumpet, it has a cylindrical bore flared to a bell. Its mouthpiece is larger, however, suited to its deeper musical register, and is parabolic in cross section, like a cornet");
    }
}
