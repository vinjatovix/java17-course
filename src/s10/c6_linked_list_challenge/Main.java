package s10.c6_linked_list_challenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

	@Override
	public String toString() {
		return String.format("%s (%d)", name, distance);
	}
}

public class Main {
	public static void main(String[] args) {
		LinkedList<Place> placesToVisit = new LinkedList<>();
		Place adelaide = new Place("Adelaide", 1374);
		addPlace(placesToVisit, adelaide);

		addPlace(placesToVisit, new Place("adelaide", 1374)); //? Record compares all the values of the fields so this lower case 'a' will be considered as a different place

		addPlace(placesToVisit, new Place("Sydney", 0));
		addPlace(placesToVisit, new Place("Melbourne", 877));
		addPlace(placesToVisit, new Place("Brisbane", 917));

		System.out.println(placesToVisit);

		run(placesToVisit);

	}

	private static void run(LinkedList<Place> placesToVisit) {
		var iterator = placesToVisit.listIterator();
		Scanner scanner = new Scanner(System.in);
		boolean quitLoop = false;
		boolean forward = true;

		printMenu();

		while (!quitLoop) {
			if (!iterator.hasPrevious()) {
				System.out.println("Originating : " + iterator.next());
				forward = true;
			}
			if (!iterator.hasNext()) {
				System.out.println("Final : " + iterator.previous());
				forward = false;
			}

			System.out.println("Enter your choice: ");
			String menuChoice = scanner.nextLine().toUpperCase().substring(0, 1);

			switch (menuChoice) {
				case "F":
					System.out.println("Going forward");
					if (!forward) { //? we need to call next twice to compensate the cursor position
						forward = true;
						if (iterator.hasNext()) {
							iterator.next(); //? to compensate the cursor position between the elements
						}
					}
					if (iterator.hasNext()) {
						System.out.println("Now visiting: " + iterator.next());
					}
					break;
				case "B":
					System.out.println("Going backwards");
					if (forward) {
						forward = false;
						if (iterator.hasPrevious()) {
							iterator.previous();
						}
					}
					if (iterator.hasPrevious()) {
						System.out.println("Now visiting: " + iterator.previous());
					}
					break;
				case "M":
					printMenu();
					break;
				case "L":
					System.out.println(placesToVisit);
					break;
				case "Q":
					quitLoop = true;
					break;
				default:
					quitLoop = true;
					break;
			}
		}
	}

	private static void addPlace(LinkedList<Place> list, Place place) {
		//		if (list.contains(place)) { //? Record compares all the values of the fields so we can use contains, but case sensitivity will be considered
		//			System.out.println("Place already exists");
		//			return;
		//	}

		for (Place p : list) {
			if (p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Place already exists: " + p);
				return;
			}
		}

		int matchedIndex = 0;
		for (var listPlace : list) {
			if (place.distance() < listPlace.distance()) {
				list.add(matchedIndex, place);
				return;
			}
			matchedIndex++;

		}
		list.add(place);
	}

	private static void printMenu() {
		System.out.println("""
						Available actions
						(F)orward
						(B)ackwards
						(L)ist Places
						(M)enu
						(Q)uit""");

	}
}
