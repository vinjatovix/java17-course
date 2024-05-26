package s9_arrays.c12_2d_arrays;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] my2DArray = new int[4][4];

		System.out.println("first");

		for (int[] row : my2DArray) {
			System.out.println(Arrays.toString(row));
		}


		for (int i = 0; i < my2DArray.length; i++) {
			var innerArray = my2DArray[i];
			for (int j = 0; j < innerArray.length; j++) {
				//				System.out.print(my2DArray[i][j] + " ");
				my2DArray[i][j] = (i * 10) + (j + 1);
				//			} System.out.println();
			}


		System.out.println("second");

			for (var row : my2DArray) {
				for (var el : row) {
					System.out.print(el + " ");
				}
				System.out.println();
			}

			System.out.println("third");

			System.out.println(Arrays.deepToString(my2DArray));
		}
	}
}
