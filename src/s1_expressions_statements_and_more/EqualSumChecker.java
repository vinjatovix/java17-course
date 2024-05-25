package s1_expressions_statements_and_more;

public class EqualSumChecker {
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}

	public static boolean hasEqualSum(int num1, int num2, int num3) {
		return num1 + num2 == num3;
	}
}
