import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) { // check the day comes in spring season or not
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the month: ");
        int month = input.nextInt(); // taking user input for month

        System.out.print("Enter the day: ");
        int day = input.nextInt(); // taking user input for day

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
