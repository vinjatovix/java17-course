package s10.c3_array_list_challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean flag = true;
		ArrayList<String> groceries = new ArrayList<>();
		while (flag) {
			printActions();
			switch (Integer.parseInt(scanner.nextLine())) {
				case 0 -> {
					System.out.println("Shutting down...");
					flag = false;

				} case 1 -> addItems(groceries);
				case 2 -> removeItems(groceries);
				default -> flag = false;
			} groceries.sort(Comparator.naturalOrder());
			System.out.println(groceries);
		}

	}

	private static void addItems(ArrayList<String> groceries) {
		System.out.println("Add items [separated by commas]: ");
		String[] items = scanner.nextLine().split(",");
		for (String item : items) {
			String trimmed = item.trim();
			if (!groceries.contains(trimmed)) {
				groceries.add(trimmed);
			}
		}

	}

	private static void removeItems(ArrayList<String> groceries) {
		System.out.println("Remove items [separated by commas]: ");
		String[] items = scanner.nextLine().split(",");
		for (String item : items) {
			String trimmed = item.trim();
			if (!groceries.contains(trimmed)) {
				groceries.remove(trimmed);
			}
		}

	}

	private static void printActions() {
		String textBlock = """
						Available actions:
												
						press 0 - to shutdown
						press 1 - to add a grocery
						press 2 - to remove a grocery
												
						Enter a number for which action you want to perform: 
						""";
		System.out.println(textBlock + " ");
	}
}
