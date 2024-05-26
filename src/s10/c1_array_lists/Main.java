package s10.c1_array_lists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}
}

public class Main {
	public static void main(String[] args) {
		Object[] groceryArray = new Object[3];
		groceryArray[0] = new GroceryItem("Milk");
		groceryArray[1] = new GroceryItem("Bread");
		groceryArray[2] = "whatever";  //? this is not a GroceryItem
		System.out.println(Arrays.toString(groceryArray));

		GroceryItem[] groceryItems = new GroceryItem[3]; //? this is an array of GroceryItem
		groceryItems[0] = new GroceryItem("Milk");
		groceryItems[1] = new GroceryItem("Bread");
		//!		groceryItems[2] = "whatever"; //? this will not work
		groceryItems[2] = new GroceryItem("Butter", "DAIRY", 2);
		System.out.println(Arrays.toString(groceryItems));

		ArrayList objectList = new ArrayList(); //? this is an ArrayList of Object
		objectList.add(new GroceryItem("Milk"));
		objectList.add("yogurt");

		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Milk"));
		groceryList.add(1, new GroceryItem("Bread")); //? this will add the item at index 1
		//		groceryList.add("yogurt"); //? this will not work
		System.out.println(groceryList); //? this will call the toString method of the ArrayList
	}
}
