package s9_arrays.c1;

import java.util.Arrays;
import java.util.Objects;

public class Main {
	public static void main(String[] args) {
		int[] myIntArray = new int[10];
		myIntArray[5] = 50;
		//!		myIntArray[0] = 10.5; // Error: incompatible types: possible lossy conversion from double to int
		//!		myIntArray[1] = "abc"; // Error: incompatible types: String cannot be converted to int
		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[5]);

		System.out.println();

		double[] myDoubleArray = new double[10];
		myDoubleArray[2] = 3.5;
		System.out.println(myDoubleArray[2]);

		System.out.println();

		String[] names = {"John", "Jane", "Joe"};
		System.out.println(names[0]);

		System.out.println();

		int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("firstTen[0] = " + firstTen[0]);
		int arrayLength = firstTen.length;
		System.out.println("arrayLength = " + arrayLength);
		System.out.println("firstTen[arrayLength - 1] = " + firstTen[arrayLength - 1]);

		System.out.println();

		//		int[] newArray;
		// //		!		newArray = {1, 2, 3}; // Error: array dimension missing
		//		newArray = new int[]{1, 2, 3};
		//		for (int i = 0; i < newArray.length; i++) {
		//			System.out.print("newArray[" + i + "] = " + newArray[i] + " ");
		//		}

		int[] newArray;
		newArray = new int[3];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = newArray.length - i;
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}

		System.out.println();


		//? for each
		for (int element : newArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println(newArray); //? [I@15db9742

		String arrayElemetsInAString = Arrays.toString(newArray);
		System.out.println(arrayElemetsInAString); //? [3, 2, 1]

		Object objectVariable = newArray;
		if (objectVariable instanceof int[]) {
			System.out.println("objectVariable is an int[]");
		}
		Object[] objectArray = new Object[3];
		objectArray[0] = "John";
		objectArray[1] = new StringBuilder("Jane");
		System.out.println(objectArray[0]);
		System.out.println(objectArray[1]);
		objectArray[2] = newArray;
		System.out.println(objectArray[2]); //? [I@15db9742
	}
}
