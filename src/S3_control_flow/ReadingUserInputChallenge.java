package S3_control_flow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int counter = 1;
		double sum = 0;

		do {
			System.out.print("Enter number #" + counter + ": ");
			String nextInt = scanner.nextLine();
			try {
				double number = Double.parseDouble(nextInt);
				counter++;
				sum += number;
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid Number : " + nfe.getMessage());
			}
		} while (counter <= 5);

		System.out.println("Sum = " + sum);
	}
}
