import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt(); // user input 

        int result = checkNumber(num); // call the function to check the number

        if (result == 1) { // number is positive
            System.out.println("The number is positive.");
        } else if (result == -1) { // number is negative
            System.out.println("The number is negative.");
        } else { // number is zero
            System.out.println("The number is zero.");
        }

        input.close(); // close the input stream, object can not be used further
    }
}
