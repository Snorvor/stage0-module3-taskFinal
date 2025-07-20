package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFahrenheit = (temperatureCelsius * 1.8F) + 32;

        System.out.println(temperatureFahrenheit);
    }
}
