package s10.c5_linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		//		LinkedList<String> placesToVisit = new LinkedList<>();
		var placesToVisit = new LinkedList<String>(); //? in var we need to pass the type argument
		placesToVisit.add("Sydney");
		placesToVisit.add(0, "Canberra");
		System.out.println(placesToVisit);

		addMoreElements(placesToVisit);
		System.out.println(placesToVisit);

		//		removeElements(placesToVisit);
		//		System.out.println(placesToVisit);

		gettingElements(placesToVisit);

		printItinerary(placesToVisit);
		printItinerary2(placesToVisit);
		printItinerary3(placesToVisit);
		System.out.println("-".repeat(30));
		testIterator(placesToVisit);
	}

	private static void addMoreElements(LinkedList<String> list) {

		list.addFirst("Darwin");
		list.addLast("Hobart");
		// queue methods
		list.offer("Melbourne"); //? add to the end of the list
		list.offerFirst("Brisbane"); //? add to the beginning of the list
		list.offerLast("Toowoomba"); //? add to the end of the list
		// Stack methods
		list.push("Alice Springs"); //? add to the beginning of the list
		list.add("Perth"); //? add to the end of the list

	}

	private static void removeElements(LinkedList<String> list) {
		list.remove(4); //? remove the element at index 4
		list.remove("Brisbane"); //? remove the first occurrence of "Brisbane"
		System.out.println(list);
		String s1 = list.remove(); //? remove the first element
		System.out.println(s1 + " removed");
		String s2 = list.removeFirst(); //? remove the first element
		System.out.println(s2 + " removed");
		String s3 = list.removeLast(); //? remove the last element
		System.out.println(s3 + " removed");

		// Queue/Deque methods
		String p1 = list.poll(); //? remove the first element
		System.out.println(p1 + " removed");
		String p2 = list.pollFirst(); //? remove the first element
		System.out.println(p2 + " removed");
		String p3 = list.pollLast(); //? remove the last element
		System.out.println(p3 + " removed");

		// Stack methods
		String p4 = list.pop(); //? remove the first element
		System.out.println(p4 + " removed");

	}

	private static void gettingElements(LinkedList<String> list) {
		System.out.println("Retrieved = " + list.get(4)); //? get the element at index 4
		System.out.println("getFirst = " + list.getFirst()); //? get the first element
		System.out.println("getLast = " + list.getLast()); //? get the last element
		System.out.println("Darwin is at position: " + list.indexOf("Darwin")); //? get the index of "Darwin", big O(n)
		// Queue/Deque methods
		System.out.println("element = " + list.element()); //? get the first element
		// Stack methods
		System.out.println("peek = " + list.peek()); //? get the first element
		System.out.println("peekFirst = " + list.peekFirst()); //? get the first element
		System.out.println("peekLast = " + list.peekLast()); //? get the last element
	}

	public static void printItinerary(LinkedList<String> list) {
		System.out.println("-".repeat(30));
		System.out.println("printItinerary");

		System.out.println("Start: " + list.getFirst());

		for (int i = 1; i < list.size() - 1; i++) { //? we start from 1 because we already got the first element
			System.out.println("---> from " + list.get(i - 1) + " to " + list.get(i));
		}

		System.out.println("End: " + list.getLast());
	}

	public static void printItinerary2(LinkedList<String> list) {
		System.out.println("-".repeat(30));
		System.out.println("printItinerary2");

		System.out.println("Start: " + list.getFirst());

		String previous = list.getFirst(); //! is more efficient but here we have the problem of the first element, is less flexible than the traditional for loop
		for (String city : list) {
			System.out.println("---> from " + previous + " to " + city);
			previous = city;
		}

		System.out.println("End: " + list.getLast());
	}

	public static void printItinerary3(LinkedList<String> list) {
		System.out.println("-".repeat(30));
		System.out.println("printItinerary3");

		System.out.println("Start: " + list.getFirst());
		String previous = list.getFirst();
		ListIterator<String> iterator = list.listIterator(1); //? we can start from index 1
		while (iterator.hasNext()) {
			var city = iterator.next(); //? we can use the iterator to go back and forth
			System.out.println("---> from " + previous + " to " + city);
			previous = city;
		}
		System.out.println("End: " + list.getLast());
	}

	private static void testIterator(LinkedList<String> list) {
		var notListIterator = list.iterator(); //? iterators only can go forward and only supports remove
		while (notListIterator.hasNext()) {
			if (notListIterator.next().equals("Brisbane")) {
				notListIterator.remove();
				//				list.remove(); //! this will throw an exception because the list is being modified
			}
		}
		list.removeIf(s -> s.equals("Brisbane")); //? this is the same as the previous loop but instead of using an iterator we use a lambda on the list
		System.out.println("nonListIterator " + list);

		System.out.println("-".repeat(30));


		var iterator = list.listIterator(); //? list iterators can go back and forth and supports add, remove and set
		while (iterator.hasNext()) {
			//			System.out.println(iterator.next());
			if (iterator.next().equals("Canberra")) {
				iterator.set("Lake Wivenhoe"); //? this will replace the last element returned by next or previous,
				iterator.add("Brisbane"); //? this will add "Brisbane" before "Canberra"
				//				iterator.set("Lake Wivenhoe"); //! can't used after add
			}
		}
		System.out.println("listIterator " + list);
		System.out.println("-".repeat(30));


		while (iterator.hasNext()) { //? this will not work because the iterator is at the end of the list
			System.out.println(iterator.next());
		}

		while (iterator.hasPrevious()) { //? this will work because the iterator is at the end of the list
			System.out.println("previous = " + iterator.previous());
			//			System.out.println("next = " + iterator.next()); //! this will cause an infinite loop
		}

		System.out.println("-".repeat(30));

		var iterator2 = list.listIterator(3); //? we can start from and index

		System.out.println("next = " + iterator2.next());
		System.out.println("previous = " + iterator2.previous());

		//? iterator places between elements

	}
}
