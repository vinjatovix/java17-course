package s3_control_flow;

public class ForLoop {
	public static void main(String[] args) {
		double amount = Math.random() * 10000;
		for (double i = 2; i < 9; i += 0.5d) {
			System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(amount, i)));
		}

		System.out.println("************************");

		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number " + i + " is a prime number");
				if (count == 10) {
					System.out.println("found " + count + " prime numbers, exiting loop");
					break;
				}
			}
		}

	}

	private static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	private static boolean isPrime(int inputNumber) {
		if (inputNumber == 1) {
			return false;
		}

		for (int divisor = 2; divisor <= inputNumber / 2; divisor++) {
			if (inputNumber % divisor == 0) {
				return false;
			}
		}

		return true;
	}


}
