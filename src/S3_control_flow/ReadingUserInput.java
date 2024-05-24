package S3_control_flow;

import java.util.Calendar;
import java.util.Scanner;

public class ReadingUserInput {
	public static void main(String[] args) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);

		try {
			System.out.println(getInputFromConsole(currentYear));
		} catch (NullPointerException e) {
			System.out.println(getInputFromScanner(currentYear));
		}

	}

	public static String getInputFromConsole(int currentYear) {
		// System.console() returns null if the application is not run from the command line
		// so this method will not work if the application is run from an IDE
		String name = System.console().readLine("Enter your name: ");
		System.out.println("Hello " + name);

		String dateOfBirth = System.console().readLine("Enter your date of birth: ");
		boolean isValid = false;
		int age = 0;
		do {
			age = checkData(currentYear, dateOfBirth);
			if (age == -1) {
				System.out.println("Invalid date of birth. Please try again.");
				dateOfBirth = System.console().readLine("Enter your date of birth: ");
			} else {
				isValid = true;
			}
		} while (!isValid);

		System.out.println("You are " + age + " years old.");

		return "";
	}


	public static String getInputFromScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);

		boolean isValid = false;
		int age = 0;
		do {
			System.out.println("Enter a year of birth between " + (currentYear - 125) + " and " + currentYear);
			try {
				age = checkData(currentYear, scanner.nextLine());
				isValid = age >= 0;
			} catch (NumberFormatException badUserInput) {
				System.out.println("Characters not allowed, " + badUserInput.getMessage());
			}
		} while (!isValid);
		System.out.println("You are " + age + " years old.");

		return "";
	}

	public static int checkData(int currentYear, String dateOfBirth) {
		int dob = Integer.parseInt(dateOfBirth);
		int minYear = currentYear - 125;

		if (dob < minYear || dob > currentYear) {
			return -1;
		}

		return currentYear - dob;
	}

}
