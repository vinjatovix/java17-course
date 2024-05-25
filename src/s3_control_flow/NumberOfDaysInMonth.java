package s3_control_flow;

public class NumberOfDaysInMonth {
	public static void main(String[] args) {
		System.out.println(getDaysInMonth(1, 2020)); // 31
		System.out.println(getDaysInMonth(2, 2020)); // 29
		System.out.println(getDaysInMonth(2, 2018)); // 28
		System.out.println(getDaysInMonth(-1, 2020)); // -1
		System.out.println(getDaysInMonth(1, -2020)); // -1
	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			return -1;
		}

		return switch (month) {
			case 1 -> 31;
			case 2 -> isLeapYear(year) ? 29 : 28;
			case 3 -> 31;
			case 4 -> 30;
			case 5 -> 31;
			case 6 -> 30;
			case 7 -> 31;
			case 8 -> 31;
			case 9 -> 30;
			case 10 -> 31;
			case 11 -> 30;
			case 12 -> 31;
			default -> -1;
		};
	}

	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999) {
			return false;
		}

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				return year % 400 == 0;
			} else {
				return true;
			}
		}

		return false;
	}
}
