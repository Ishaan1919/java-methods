import java.util.Scanner;

public class NumbersSum{
    public static int sumOfNumber(int number){
        int sum = 0;
        for(int i=1;i<=number;i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int sum = sumOfNumber(number);

        System.out.print("Sum of the " + number + " natural numbers is " + sum);

        input.close();
    }
}