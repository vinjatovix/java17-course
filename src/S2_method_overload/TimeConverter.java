package S2_method_overload;

public class TimeConverter {
	public static void main(String[] args) {
		System.out.println(getDurationString(-2));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65, 90));
		System.out.println(getDurationString(-2, 4));
		System.out.println(getDurationString(-65, -4));
		System.out.println(getDurationString(65, 45));

	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid data for seconds(" + seconds + ")";
		}

		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		int remainingSeconds = seconds % 60;

		return hours + "h " + minutes + "m " + remainingSeconds + "s";
	}

	public static String getDurationString(int minutes, int seconds) {
		String errorMessage = validateInput(minutes, seconds);
		if (!errorMessage.isEmpty()) {
			return errorMessage;
		}


		int totalSeconds = (minutes * 60) + seconds;

		return getDurationString(totalSeconds);
	}

	private static String validateInput(int minutes, int seconds) {
		String errorMessage = "";
		if (minutes < 0) {
			errorMessage = "Invalid data for minutes(" + minutes + ")";

		}
		if (seconds < 0 || seconds > 59) {
			if (!errorMessage.isEmpty()) {
				errorMessage += " and ";
			}
			errorMessage += "Invalid data for seconds(" + seconds + ")";

		}

		return errorMessage;
	}
}
