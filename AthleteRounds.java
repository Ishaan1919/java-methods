import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3; // find the perimeter for the triangle
        return (int)(distance / perimeter); // calculate the number of rounds
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        double totalDistance = 5000; 
        int rounds = calculateRounds(side1, side2, side3, totalDistance); // call the function to get the number of rounds

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        input.close(); // close the input stream
    }
}
