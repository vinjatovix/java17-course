package s9_arrays.c4_array_challenge;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] unsortedArray = getRandomArray(5);
		System.out.println("Unsorted Array:");
		System.out.println(Arrays.toString(unsortedArray));

		System.out.println();
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(reverseSortIntegers(unsortedArray)));


	}

	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		return array;
	}

	public static int[] reverseSortIntegers(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}

		return sortedArray;
	}
}
