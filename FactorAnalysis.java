import java.util.Scanner;

public class FactorAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Finding factors
        int[] factors = findFactors(number);
        
        // Calculating sum, sum of squares, and product of factors
        int sum = calculateSum(factors);
        int product = calculateProduct(factors);
        int sumOfSquares = calculateSumOfSquares(factors);
        
        // Display results
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        input.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }
}
