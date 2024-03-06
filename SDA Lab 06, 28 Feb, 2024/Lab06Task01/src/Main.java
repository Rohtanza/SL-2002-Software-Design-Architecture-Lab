// File: WorldPopulationEstimator.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current world population: ");
        double currentPopulation = scanner.nextDouble();
        System.out.print("Enter annual population growth rate (in percentage): ");
        double growthRate = scanner.nextDouble() / 100.0;

        System.out.println("\nYear\tEstimated Population");
        System.out.println("-----------------------------");

        for (int year = 1; year <= 5; year++) {
            double estimatedPopulation = calculateEstimatedPopulation(currentPopulation, growthRate, year);
            System.out.printf("%d\t%.2f\n", year, estimatedPopulation);
        }

        scanner.close();
    }

    public static double calculateEstimatedPopulation(double currentPopulation, double growthRate, int years) {
        return currentPopulation * Math.pow(1 + growthRate, years);
    }
}
