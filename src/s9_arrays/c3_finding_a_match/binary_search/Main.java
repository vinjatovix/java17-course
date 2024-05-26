package s9_arrays.c3_finding_a_match.binary_search;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] sArray = {"apple", "banana", "orange", "grape", "kiwi"};
		System.out.println(Arrays.toString(sArray));
		System.out.println(findInArray(sArray, "apple"));
		System.out.println(findInArray(sArray, "melon"));


	}

	public static String findInArray(String[] sArray, String target) {
		String[] sortedArray = Arrays.copyOf(sArray, sArray.length);
		Arrays.sort(sortedArray); //? binarySearch requires a sorted array, sort modifies the original array
		int index = Arrays.binarySearch(sortedArray, target);

		return target + " is " + (index >= 0 ? "" : "not ") + "found in the array";
	}
}