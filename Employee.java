import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String name;
    private int age;
    private double grossSalary;
    private float takeHomeSalary;
    private char grade;

    public void input() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            name = reader.readLine();

            System.out.print("Enter age: ");
            age = Integer.parseInt(reader.readLine());

            System.out.print("Enter gross salary: ");
            grossSalary = Double.parseDouble(reader.readLine());

            System.out.print("Enter take-home salary: ");
            takeHomeSalary = Float.parseFloat(reader.readLine());

            System.out.print("Enter grade: ");
            grade = reader.readLine().charAt(0);

            System.out.println("Record added successfully!");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: Invalid input. Please try again.");
        }
    }

    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Take-Home Salary: " + takeHomeSalary);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            try {
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        employee.input();
                        break;
                    case 2:
                        employee.display();
                        break;
                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (IOException | NumberFormatException e) {
                System.err.println("Error: Invalid input. Please try again.");
            }
        }
    }
}