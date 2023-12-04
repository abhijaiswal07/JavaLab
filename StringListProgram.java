import java.util.ArrayList;
import java.util.Scanner;

public class StringListProgram {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert String");
            System.out.println("2. Display Strings");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to insert: ");
                    String newString = scanner.nextLine();
                    stringList.add(newString);
                    System.out.println("String inserted successfully!");
                    break;
                case 2:
                    System.out.println("Strings in the list:");
                    for (String str : stringList) {
                        System.out.println(str);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}