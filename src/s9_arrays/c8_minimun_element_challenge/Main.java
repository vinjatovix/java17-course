package s9_arrays.c8_minimun_element_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] array = readIntegers();
		System.out.println(Arrays.toString(array));
		int result = findMin(array);
		System.out.println("Minimum element: " + result);

	}

	private static int[] readIntegers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of integer, separated by commas: ");
		String input = scanner.nextLine();

		String[] splits = input.split(",");
		int[] values = new int[splits.length];

		for (int i = 0; i < splits.length; i++) {
			values[i] = Integer.parseInt(splits[i].trim()); //? trim() removes leading and trailing whitespaces
		}

		return values;
	}

	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int j : array) {
			if (j < min) {
				min = j;
			}
		}
		return min;
	}
}
