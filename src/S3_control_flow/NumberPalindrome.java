package S3_control_flow;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int originalNumber = number;

		while (number != 0) {
			int lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number /= 10;
		}

		return originalNumber == reverse;
	}
}
