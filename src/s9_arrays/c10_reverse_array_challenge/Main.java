package s9_arrays.c10_reverse_array_challenge;

public class Main {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		reverse(array);
		printArray(array);

		int[] array2 = {1, 2, 3, 4, 5};
		int[] reversedArray = reverseCopy(array2);
		printArray(array2);
		printArray(reversedArray);
	}

	public static void reverse(int[] array) {

		int temp;
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {
			temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[i]);
		}
	}

	public static int[] reverseCopy(int[] array) {
		int[] reversedArray = new int[array.length];
		int maxIndex = array.length - 1;
		for (int el : array) {
			reversedArray[maxIndex--] = el;
		}
		return reversedArray;
	}
}
