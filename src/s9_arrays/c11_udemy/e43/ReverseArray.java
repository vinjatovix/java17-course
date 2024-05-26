package s9_arrays.c11_udemy.e43;

public class ReverseArray {

	private static void reverse(int[] array) {
		System.out.println("Array = " + java.util.Arrays.toString(array));
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
		System.out.println("Reversed array = " + java.util.Arrays.toString(array));
	}
}
