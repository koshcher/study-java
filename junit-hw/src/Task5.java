import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Task5 {

    public enum Weight {
        Milligram,
        Gram,
        Kilogram,
        Centner,
        Ton
    }

    static Map<Weight, Double> distancesToMeter = new HashMap<>() {{
        put(Weight.Centner, .01);
        put(Weight.Milligram, 1000000.0);
        put(Weight.Gram, 1000.0);
        put(Weight.Kilogram, 1.0);
        put(Weight.Ton, .001);
    }};

    public double convert(double weightValue, Weight inputWeight, Weight outputWeight) {

        double inCoefficient = distancesToMeter.get(inputWeight);
        double outCoefficient = distancesToMeter.get(outputWeight);
        return (weightValue / inCoefficient) * outCoefficient;
    }


    @Test
    public void testGramTon() {
        double res = convert(8359232, Weight.Gram, Weight.Ton);
        System.out.println(res);
        assertEquals(8.359232, res, 0.00001);
    }


    @Test
    public void testCentnerMilligram() {
        double res = convert(0.0084, Weight.Centner, Weight.Milligram);
        System.out.println(res);
        assertEquals(840000, res, 0.00001);
    }

}
