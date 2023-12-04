// Java program to Demonstrate Switch Case
// with Primitive(int) Data Type
import java.util.Scanner;
// Class
public class Test {

	// Main driver method
	public static void main(String[] args)
	{
		System.out.print("Enter Number : ");
		Scanner day = new Scanner(System.in);
		int say1 = day.nextInt();
		String dayString;

		// Switch statement with int data type
		switch (say1) {

		// Case
		case 1:
			dayString = "Monday";
			break;

		// Case
		case 2:
			dayString = "Tuesday";
			break;

			// Case
		case 3:
			dayString = "Wednesday";
			break;

			// Case
		case 4:
			dayString = "Thursday";
			break;

		// Case
		case 5:
			dayString = "Friday";
			break;

			// Case
		case 6:
			dayString = "Saturday";
			break;

			// Case
		case 7:
			dayString = "Sunday";
			break;

		// Default case
		default:
			dayString = "Invalid day";
		}
		System.out.println(dayString);
	}
}
