// Target Interface
interface TemperatureConverter {
    void convertTemperature(double celsius);
}

// Existing class (Adaptee)
class FahrenheitConverter {

    public void convertToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius : " + celsius + " °C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + " °F");
    }
}

// Adapter Class
class TemperatureAdapter implements TemperatureConverter {

    private FahrenheitConverter converter;

    // Constructor
    public TemperatureAdapter() {
        converter = new FahrenheitConverter();
    }

    // Adapting the interface method
    @Override
    public void convertTemperature(double celsius) {
        converter.convertToFahrenheit(celsius);
    }
}

// Main Class
public class AdapterDemo {

    public static void main(String[] args) {

        // Create adapter object
        TemperatureConverter converter =
                new TemperatureAdapter();

        // Convert Celsius to Fahrenheit
        converter.convertTemperature(25);
    }
}
