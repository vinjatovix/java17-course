package s9_arrays.c9_udemy.e42;

import java.util.Scanner;

public class MinimumElement {


	private static int readInteger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count:");
		return scanner.nextInt();
	}

	private static int[] readElements(int count) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[count];
		System.out.println("Enter " + count + " integers:");
		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		return array;
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
