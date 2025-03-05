import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employees = new int[10][2]; // Column 0: Salary, Column 1: Years of Service
        double[][] bonusData = new double[10][2]; // Column 0: Bonus Amount, Column 1: New Salary
        
        initializeEmployees(employees);
        calculateBonuses(employees, bonusData);
        displayResults(employees, bonusData);
    }

    public static void initializeEmployees(int[][] employees) {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = random.nextInt(90000) + 10000; // Salary between 10000 to 99999
            employees[i][1] = random.nextInt(11); // Years of service between 0 to 10
        }
    }

    public static void calculateBonuses(int[][] employees, double[][] bonusData) {
        for (int i = 0; i < employees.length; i++) {
            double bonusPercentage = (employees[i][1] > 5) ? 0.05 : 0.02;
            double bonusAmount = employees[i][0] * bonusPercentage;
            bonusData[i][0] = bonusAmount;
            bonusData[i][1] = employees[i][0] + bonusAmount;
        }
    }

    public static void displayResults(int[][] employees, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-15s %-15s\n", "Employee", "Salary", "Years", "Bonus Amount", "New Salary");
        
        for (int i = 0; i < employees.length; i++) {
            totalOldSalary += employees[i][0];
            totalNewSalary += bonusData[i][1];
            totalBonus += bonusData[i][0];
            System.out.printf("%-10d %-10d %-10d %-15.2f %-15.2f\n", i + 1, employees[i][0], employees[i][1], bonusData[i][0], bonusData[i][1]);
        }
        
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-20s: %.2f\n", "Total Old Salary", totalOldSalary);
        System.out.printf("%-20s: %.2f\n", "Total New Salary", totalNewSalary);
        System.out.printf("%-20s: %.2f\n", "Total Bonus Amount", totalBonus);
    }
}
