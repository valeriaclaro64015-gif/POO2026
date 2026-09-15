public class TestThermometer {
    public static void main(String[] args) {

     Thermometer thermometer = new Thermometer();

        System.out.println("Temperatura inicial: " + thermometer.getTemperature());

        boolean result = thermometer.setTemperature(25);
        System.out.println("¿Temperatura aceptada? " + result);
        System.out.println("Temperatura actual: " + thermometer.getTemperature());

        result = thermometer.setTemperature(120);
        System.out.println("¿Temperatura aceptada? " + result);
        System.out.println("Temperatura actual: " + thermometer.getTemperature());
    }
}
