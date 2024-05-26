package s9_arrays.c13_multid_arrays;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] array2 = new int[4][4];

		//!		array2[1] = {1, 2, 3, 4}; // this will not work
		array2[1] = new int[]{10, 20, 30};
		System.out.println(Arrays.deepToString(array2));

		Object[] anyArray = new Object[3];
		System.out.println(Arrays.deepToString(anyArray));
		anyArray[0] = new String[]{"a", "b", "c"};
		System.out.println(Arrays.deepToString(anyArray));


		anyArray[1] = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[2] = new int[2][2][2];
		System.out.println(Arrays.deepToString(anyArray));

		for (Object element : anyArray){
			System.out.println("element type = " + element.getClass().getSimpleName());
			System.out.println("Element toString = " + element);
			System.out.println(Arrays.deepToString((Object[]) element));
		}
	}




}

