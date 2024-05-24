package S3_control_flow;

public class NumberToWords {
	public static void main(String[] args) {
		numberToWords(0);
		numberToWords(123);
		numberToWords(1010);
		numberToWords(1000);
		numberToWords(-12);

	}

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}

		int reversedNumber = reverse(number);
		int originalNumberDigitCount = getDigitCount(number);
		int reversedNumberDigitCount = getDigitCount(reversedNumber);

		if (number == 0) {
			System.out.println("Zero");
		}

		while (reversedNumber != 0) {
			int digit = reversedNumber % 10;
			switch (digit) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
			}
			reversedNumber /= 10;
		}

		if (originalNumberDigitCount != reversedNumberDigitCount) {
			for (int i = 0; i < originalNumberDigitCount - reversedNumberDigitCount; i++) {
				System.out.println("Zero");
			}
		}
	}

	public static int reverse(int number) {
		int reversedNumber = 0;
		while (number != 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}
		return reversedNumber;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}

		if (number == 0){
			return 1;
		}

		int count = 0;
		for (int i = 1; i <= number; i *= 10) {
			count++;
		}
		return count;
	}
}
