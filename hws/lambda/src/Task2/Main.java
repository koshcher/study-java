package Task2;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        var fraction1 = new Fraction(3,5);
        var fraction2 = new Fraction(8,7);

        // 1
        BiFunction<Fraction, Fraction, Fraction> sumFractions = (Fraction f1, Fraction f2)
                -> new Fraction(f1.numerator*f2.denominator+f2.numerator*f1.denominator,f1.denominator*f2.denominator);
        System.out.println(sumFractions.apply(fraction1, fraction2).toString());

        // 2

        BiFunction<Fraction, Fraction, Fraction> subFractions = (Fraction f1, Fraction f2)
                -> new Fraction(f1.numerator*f2.denominator-f2.numerator*f1.denominator,f1.denominator*f2.denominator);
        System.out.println(subFractions.apply(fraction1, fraction2).toString());


        // 3
        BiFunction<Fraction, Fraction, Fraction> mulFractions = (Fraction f1, Fraction f2)
                -> new Fraction(f1.numerator*f2.numerator,f1.denominator*f2.denominator);
        System.out.println(mulFractions.apply(fraction1, fraction2).toString());


        // 4
        BiFunction<Fraction, Fraction, Fraction> divFractions = (Fraction f1, Fraction f2)
                -> new Fraction(f1.numerator*f2.denominator,f1.denominator*f2.numerator);
        System.out.println(divFractions.apply(fraction1, fraction2).toString());
    }
}
