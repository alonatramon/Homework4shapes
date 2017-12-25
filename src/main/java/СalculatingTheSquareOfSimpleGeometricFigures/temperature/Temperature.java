package СalculatingTheSquareOfSimpleGeometricFigures.temperature;

public class Temperature {

    private final static double CONSTANT_TEMPERATURE = 1.8;
    private final static int CONSTANT = 32;

    public static double getFahrenheit(int Fahrenheit) {

        return (Fahrenheit * CONSTANT_TEMPERATURE) + CONSTANT;

    }

    public static double getCelsius(int Celsius) {

        return (Celsius - CONSTANT) / CONSTANT_TEMPERATURE;

    }
}
