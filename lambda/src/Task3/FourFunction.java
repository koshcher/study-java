package Task3;

@FunctionalInterface
interface FourFunction<One, Two, Three, Four, Five> {
    public Five apply(One one, Two two, Three three, Four four);
}