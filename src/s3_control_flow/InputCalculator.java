package s3_control_flow;

public class InputCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		int sum = 0;
		int count = 0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while (true) {
			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();
				sum += number;
				count++;
			} else {
				break;
			}

			scanner.nextLine();
		}

		scanner.close();

		long average = Math.round((double) sum / count);

		System.out.println("SUM = " + sum + " AVG = " + average);
	}
}
