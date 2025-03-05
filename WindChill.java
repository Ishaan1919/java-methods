import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();
        
        // Calculating wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);
        
        System.out.println("The wind chill temperature is: " + windChill + " °F");
        input.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
