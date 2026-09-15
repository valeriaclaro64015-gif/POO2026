public class Thermometer {
  private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public boolean setTemperature(double newTemperature) {
        if (newTemperature >= -50 && newTemperature <= 100) {
            temperature = newTemperature;
            return true;
        }

        return false;
    }
}