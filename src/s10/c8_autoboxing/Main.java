package s10.c8_autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Integer boxedInt = Integer.valueOf(15); //? preferred but unnecessary
		Integer deprecatedBoxing = new Integer(13); //! deprecated since JDK 9
		int unboxedInt = boxedInt.intValue(); // unnecessary

		//* Automatic
		Integer autoBoxed = 15;
		int autoUnboxed = autoBoxed;
		System.out.println(autoBoxed.getClass());

		Double resultBoxed = getLiteralDoublePrimitive();
		double resultUnBoxed = getDoubleObject();

		Integer[] wrapperArray = new Integer[5]; //? this is an array of Integer boxes
		wrapperArray[0] = 50;
		System.out.println(Arrays.toString(wrapperArray));
		System.out.println(wrapperArray[0].getClass()); //? class java.lang.Integer

		Character[] charactersArray = {'a', 'b', 'c'};
		System.out.println(Arrays.toString(charactersArray));

		var ourList = getList(1, 2, 3, 4, 5); //? check inlay hints java type inference
		System.out.println(ourList);
		var ourList2 = List.of(1, 2, 3, 4, 5); //? check inlay hints java type inference
		System.out.println(ourList2);


	}

	private static Double getDoubleObject() {
		return Double.valueOf(100.00);
	}

	private static double getLiteralDoublePrimitive() {
		return 100.0;
	}

	//? Boxing on methods
	private static int returnAnInt(Integer i) {
		return i;
	}

	private static Integer returnAnInteger(int i) {
		return i;
	}

	private static ArrayList<Integer> getList(int... varargs) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : varargs) {
			list.add(i);
		}
		return list;

	}

}
