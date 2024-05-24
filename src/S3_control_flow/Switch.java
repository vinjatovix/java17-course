package S3_control_flow;

public class Switch {
	public static void main(String[] args) {
		int value = (int) (Math.random() * 5) + 1;

		switch (value) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Value was 3, 4, or 5");
				break;
			default:
				System.out.println("Value was not 1, 2, 3, 4, or 5");
				break;
		}

		System.out.println(getMessage(value));
		System.out.println(getQuarter("January"));
		System.out.println(getQuarter("SePteMber"));
		System.out.println(getQuarter("jupiter"));
	}

	private static String getMessage(int value) {
		return switch (value) {
			case 1 -> "Value was 1";
			case 2 -> "Value was 2";
			case 3, 4, 5 -> "Value was 3, 4, or 5";
			default -> "Value was not 1, 2, 3, 4, or 5";
		};
	}

	public static String getQuarter(String month) {
		String monthLower = month.toLowerCase();

		return switch (monthLower) {
			case "january", "february", "march" -> "Q1";
			case "april", "may", "june" -> "Q2";
			case "july", "august", "september" -> "Q3";
			case "october", "november", "december" -> "Q4";
			default -> {
				yield "Invalid month: " + month;
			}
		};
	}
}
