public class TestThermometer {
    public static void main(String[] args) {

     Thermometer thermometer = new Thermometer();

       //Correction test
       if(thermometer.setTemperature(100)==true){
           System.out.println("Temperature successfully accepted.");
           System.out.println(thermometer.getTemperature());
        }else{
            System.out.println("unacceptable temperature");
        }

        //test 1

        if (thermometer.setTemperature(-51)) {
          System.out.println("Temperature successfully accepted. ");
        }else{
          System.out.println("unacceptable temperature");
        }

        //test 2 

        if (thermometer.setTemperature(0)) {
          System.out.println("Temperature successfully accepted ");
        }else{
          System.out.println("unacceptable temperature");
        }

        //test 3 

          if (thermometer.setTemperature(110)) {
          System.out.println("Temperature successfully accepted");
        }else{
          System.out.println("unacceptable temperature");
        }
    


    }
}
