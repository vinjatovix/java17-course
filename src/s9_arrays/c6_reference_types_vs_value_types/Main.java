package s9_arrays.c6_reference_types_vs_value_types;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] myIntArray = new int[5];
		int[] anotherArray = myIntArray; //? anotherArray is a reference to myIntArray

		anotherArray[0] = 1; //? this will change myIntArray as well
		modifyArray(myIntArray); //? this will change myIntArray as well

		System.out.println("myIntArray: " + Arrays.toString(myIntArray));
		System.out.println("anotherArray: " + Arrays.toString(anotherArray));

	}

	private static void modifyArray(int[] array) {
		array[1] = 2; //? array is a reference
	}
}
