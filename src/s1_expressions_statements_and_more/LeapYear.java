package s1_expressions_statements_and_more;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1800));
	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}
