package s9_arrays.c7_varargs;

public class Main {
	public static void main(String... args){
		System.out.println("Hello, World!");

		String[] splitString = "This is a sentence".split(" ");
		printText(splitString);
		System.out.println("_".repeat(10));
		printText("This");
		System.out.println("_".repeat(10));
		printText("This", "is", "a", "sentence");
		System.out.println("_".repeat(10));
		printText();

		String[] sArray = {"This", "is", "a", "sentence"};
		System.out.println(String.join(",", sArray));
	}

	private static void printText(String... textList) {
		for (String text : textList) {
			System.out.println(text);
		}
	}
}
