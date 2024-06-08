import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hourly Employee's Name:");
        String hourlyEmployeeName = scanner.nextLine();
        System.out.println("Enter Hourly Rate:");
        double hourlyRate = scanner.nextDouble();
        System.out.println("Enter Hours Worked:");
        int hoursWorked = scanner.nextInt();

        HourlyEmployee hourlyEmployee = new HourlyEmployee(hourlyEmployeeName, hourlyRate, hoursWorked);
        System.out.println("Salary of " + hourlyEmployeeName + ": " + hourlyEmployee.calcSalary());

        scanner.nextLine();

        System.out.println("Enter Salaried Employee's Name:");
        String salariedEmployeeName = scanner.nextLine();
        System.out.println("Enter Annual Salary:");
        double annualSalary = scanner.nextDouble();

        SalariedEmployee salariedEmployee = new SalariedEmployee(salariedEmployeeName, annualSalary);
        System.out.println("Salary of " + salariedEmployeeName + ": " + salariedEmployee.calcSalary());

        scanner.close();
    }
}
