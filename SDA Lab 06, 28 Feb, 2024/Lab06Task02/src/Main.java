import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in KG: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println(interpretBMI(bmi));

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "You are skinny.";
        } else if (bmi < 25) {
            return "Your have normal weight.";
        } else if (bmi < 30) {
            return "You are fat.";
        } else {
            return "You are too fat.";
        }
    }
}
