package S3_control_flow;

public class SwitchExpressionChallenge {
	public static void main(String[] args) {
		int day = (int) (Math.random() * 8);
		printDayOfWeek(day);
		printWeekDay(day);

	}

	public static void printDayOfWeek(int day) {
		String dayOkWeek = switch (day) {
			case 0 -> "Sunday";
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			default -> "Invalid day";
		};

		System.out.println(day + " stands for " + dayOkWeek);


	}

	public static void printWeekDay(int day){
		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}
}
