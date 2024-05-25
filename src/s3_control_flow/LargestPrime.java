package s3_control_flow;

public class LargestPrime {
	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
	}

	public static int getLargestPrime(int number) {
		if (number <= 1) {
			return -1;
		}

		int largestPrime = 0;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				boolean isPrime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}

				if (isPrime) {
					largestPrime = i;
				}
			}
		}

		return largestPrime;
	}
}
