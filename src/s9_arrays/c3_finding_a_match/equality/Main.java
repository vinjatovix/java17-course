package s9_arrays.c3_finding_a_match.equality;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] s1 = {1, 2, 3, 4, 5};
		int[] s2 = {1, 2, 3, 4, 5};
		int[] s3 = {5, 4, 3, 2, 1};

		System.out.println(compareArrays(s1, s2));
		System.out.println(compareArrays(s1, s3));
	}

	public static String compareArrays(int[] a1, int[] a2) {
		return Arrays.equals(a1, a2) ? "a1 and a2 are equal" : "a1 and a2 are not equal";
	}
}
