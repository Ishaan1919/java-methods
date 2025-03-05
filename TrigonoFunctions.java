import java.util.Scanner;

public class TrigonoFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();
        
        // Calculating trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
        input.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[]{sine, cosine, tangent};
    }
}
