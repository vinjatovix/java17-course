package s10.c2_arrays_vs_array_lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] originalArray = new String[]{"First", "Second", "Third"};
		var originalList = Arrays.asList(originalArray); //? we can use var if we don't know the type
		originalList.set(0, "one"); //? this will change the originalArray as well
		System.out.println("list = " + originalList);
		System.out.println("array = " + Arrays.toString(originalArray));

		originalList.sort(Comparator.naturalOrder());
		System.out.println("array = " + Arrays.toString(originalArray));

		//? we can't add or remove elements from the list because its respalded by the array
		//		originalList.remove(0); //! this will not work
		//		originalList.add("four"); //! this will not work


		List<String> newList = List.of("Sunday", "Monday", "Tuesday");
		System.out.println("newList = " + newList);

		//? in general Arrays are more efficient than ArrayLists because they have a fixed size and admits primitive types
	}
}
