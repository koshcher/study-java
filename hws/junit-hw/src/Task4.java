import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Task4 {

    public enum Distance {
        Millimeters,
        Centimeters,
        Decimeters,
        Meters,
        Kilometers
    }

    static Map<Distance, Double> distancesToMeter = new HashMap<>() {{
        put(Distance.Meters, 1.0);
        put(Distance.Millimeters, 1000.0);
        put(Distance.Centimeters, 100.0);
        put(Distance.Decimeters, 10.0);
        put(Distance.Kilometers, .001);
    }};

    public double convert(double distanceValue, Distance inputDistance, Distance outputDistance) {

        double inCoefficient = distancesToMeter.get(inputDistance);
        double outCoefficient = distancesToMeter.get(outputDistance);
        return (distanceValue / inCoefficient) * outCoefficient;
    }


    @Test
    public void testMeterDecimeter() {
        double res = convert(20, Distance.Meters, Distance.Decimeters);
        System.out.println(res);
        assertEquals(200, res, 0.001);
    }


    @Test
    public void testDecimeterKilometer() {
        double res = convert(7.5, Distance.Decimeters, Distance.Kilometers);
        System.out.println(res);
        assertEquals(0.00075, res, 0.00001);
    }


}
