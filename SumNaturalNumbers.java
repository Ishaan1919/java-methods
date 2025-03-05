import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            input.close();
            return;
        }
        
        int sumRecursive = sumUsingRecursion(number);
        int sumFormula = sumUsingFormula(number);
        
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match. The formula and recursive method produce the same result.");
        } else {
            System.out.println("Mismatch detected! There might be an issue with the computation.");
        }
        
        input.close();
    }
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
