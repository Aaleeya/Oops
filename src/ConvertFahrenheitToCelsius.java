import java.util.Scanner;

public class ConvertFahrenheitToCelsius {

    public static void main(String[] args){

        double temperature=0.0;
        double celsius=0.0;

        System.out.println("Enter current temperature: ");
        try{
            double convertedFahrenheit = convertFahrenheitToCelsius(celsius);
            System.out.println("Current temperature in Celsius is: "+convertedFahrenheit);
        }
        catch(Exception badInput){
            System.out.println("Enter a valid temperature in degrees.");
        }
    }

    public static double convertFahrenheitToCelsius(double temperature){
        Scanner inputTemp = new Scanner(System.in);
        temperature = inputTemp.nextDouble();
        if(temperature < 0){
            return -1;
        }
        double celsius = (temperature - 30)/2;
        return celsius;
    }
}
