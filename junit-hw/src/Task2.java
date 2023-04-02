import org.junit.Test;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Task2 {

    public enum Currency {
        Dollar,
        Euro,
        PoundSterling,
        Yen
    }

    static Map<Currency, Double> exchangeRate = new HashMap<>() {{
        put(Currency.Dollar, 1.0);
        put(Currency.Euro, 0.93);
        put(Currency.Yen, 130.75);
        put(Currency.PoundSterling, 0.82);
    }};

    public double convert(double value, Currency inputCurrency, Currency outputCurrency) {
        double inCoefficient = exchangeRate.get(inputCurrency);
        double outCoefficient = exchangeRate.get(outputCurrency);
        return (value / inCoefficient) * outCoefficient;
    }


    @Test
    public void testYenPound() {
        double res = convert(5,Currency.Yen, Currency.PoundSterling);
        System.out.println(res);
        assertEquals(0.031, res, 0.001);
    }

    @Test
    public void testEuroYen() {
        double res = convert(7,Currency.Euro, Currency.Yen);
        System.out.println(res);
        assertEquals(984.09, res, 0.1);
    }

}

