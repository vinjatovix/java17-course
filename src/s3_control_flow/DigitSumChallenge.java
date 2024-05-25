package s3_control_flow;

public class DigitSumChallenge {
	public static void main(String[] args) {
		System.out.println(sumDigits(1234));
		System.out.println(sumDigits(-125));
		System.out.println(sumDigits(9));
		System.out.println(sumDigits(32123));
		System.out.println(sumDigits(1254));
		System.out.println(sumDigits(1234567890));

	}

	public static int sumDigits(int number) {
		if (number < 10) {
			return -1;
		}

		int sum = 0;
		while (number > 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		return sum;
	}
}
