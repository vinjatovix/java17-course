package S2_method_overload;

public class DistanceConverter {
	public static final double CM_PER_INCH = 2.54;
	public static final int INCHES_PER_FOOT = 12;

	public static void main(String[] args) {
		System.out.println("5ft, 8in = " + convertToCm(5, 8) + "cm");
		System.out.println("68in = " + convertToCm(68) + "cm");
	}


	public static double convertToCm(int inches) {
		return inches * CM_PER_INCH;
	}

	public static double convertToCm(int feet, int inches) {
		int feetToInches = feet * INCHES_PER_FOOT;
		int totalInches = feetToInches + inches;

		return convertToCm(totalInches);
	}
}
