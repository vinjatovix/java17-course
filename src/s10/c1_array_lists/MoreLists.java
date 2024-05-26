package s10.c1_array_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
	public static void main(String[] args) {
		String[] items = {"Apple", "Banana", "Carrot", "Date", "Eggplant"};

		List<String> list = List.of(items);
		System.out.println(list);

		//		System.out.println(list.getClass().getName()); //? java.util.ImmutableCollections$ListN
		//		list.add("Figs"); //? this will not work

		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("Figs");
		System.out.println(groceries);

		ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
		System.out.println(nextList);

		groceries.addAll(nextList);
		System.out.println(groceries);

		System.out.println("third item = " + groceries.get(2));

		if (groceries.contains("pickles")) {
			System.out.println("pickles found");
		}
		groceries.add("pickles");

		System.out.println("index of pickles = " + groceries.indexOf("pickles"));
		System.out.println("last index of pickles = " + groceries.lastIndexOf("pickles"));

		groceries.remove(1);
		System.out.println(groceries);

		groceries.remove("pickles");
		System.out.println(groceries); //? this will remove the first occurrence of "pickles"

		groceries.add("milk");
		groceries.removeIf(item -> item.startsWith("m")); //? this will remove all items that start with "m"
		System.out.println(groceries);

		groceries.removeAll(List.of("Apple","Carrot")); //? this will remove all items in the list
		System.out.println(groceries);

		groceries.retainAll(List.of("Eggplant", "Date")); //? this will remove all items except the ones in the list
		System.out.println(groceries);

		groceries.clear(); //? this will remove all items
		System.out.println(groceries);
		System.out.println("isEmpty = " + groceries.isEmpty());

		groceries.addAll(Arrays.asList("Figs", "Grapes", "Honeydew"));
		groceries.addAll(List.of("Apple", "Banana", "Carrot", "Date", "Eggplant"));
		System.out.println(groceries);
		groceries.sort(Comparator.naturalOrder()); //? this will sort the list in natural order
		System.out.println(groceries);
		groceries.sort(Comparator.reverseOrder()); //? this will sort the list in reverse order
		System.out.println(groceries);

		groceries.sort(Comparator.comparing(String::length)); //? this will sort the list by length
		System.out.println(groceries);

		var groceryArray = groceries.toArray(new String[groceries.size()]); //? this will convert the list to an array, it's the most common way
		System.out.println(Arrays.toString(groceryArray));

	}
}
