package S3_control_flow;

import java.util.Scanner;

public class MinAndMaxChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double min = 0;
		double max = 0;
		int loopCounter = 0;

		while (true) {
			System.out.print("Enter number, or any letter to quit: ");
			String nextEntry = scanner.nextLine();
			try {
				double number = Double.parseDouble(nextEntry);
				if (loopCounter == 0 || number < min) {
					min = number;
				}
				if (loopCounter == 0 || number > max) {
					max = number;
				}
				loopCounter++;
			} catch (NumberFormatException nfe) {
				break;
			}

		}

		if(loopCounter > 0) {
			System.out.println("Min = " + min + ", Max = " + max);
		} else {
			System.out.println("No valid numbers entered.");
		}
	}
}
