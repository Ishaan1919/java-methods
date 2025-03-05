import java.util.Scanner;

public class RemainderQuotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for two numbers
        System.out.print("Enter dividend: ");
        int number = input.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        
        // Finding remainder and quotient
        int[] result = findRemainderAndQuotient(number, divisor);
        
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        input.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        
        return new int[]{quotient, remainder};
    }
}
