package S3_control_flow;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
	}

	public static boolean hasSharedDigit(int number1, int number2) {
		if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
			return false;
		}

		int firstDigit1 = number1 / 10;
		int lastDigit1 = number1 % 10;
		int firstDigit2 = number2 / 10;
		int lastDigit2 = number2 % 10;

		return firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2 || lastDigit1 == firstDigit2
				|| lastDigit1 == lastDigit2;
	}
}
