package s9_arrays.c5_udemy.e41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


	public static int[] getIntegers(int size) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[size];
		System.out.println("Enter " + size + " integers:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		return sortIntegers(array);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] unsortedArray) {
		int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length); //? copy the array (not reference
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
