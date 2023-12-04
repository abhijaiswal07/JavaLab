import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Try to perform some operation that may cause an exception
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());

            // Attempt to divide 10 by the entered number
            int result = 10 / number;

            // If successful, print the result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the specific exception for division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            // Catch the exception if the user doesn't enter a valid number
            System.out.println("Error: Please enter a valid number.");
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred.");
        } finally {
            // This block will always be executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
            scanner.close(); // Close the scanner in the finally block to ensure it gets closed.
        }

        System.out.println("Program continues after exception handling.");
    }
}