package s5_oop_2_polymorphism.challenges;

public class BillsBurgerChallenge {
	public static void main(String[] args) {
		//		Item coke = new Item("Drink", "Coke", 1.5);
		//		coke.printItem();
		//		coke.setSize("large");
		//		coke.printItem();
		//
		//		Item avocado = new Item("Topping", "Avocado", 2.5);
		//		avocado.printItem();

		//		Burger burger = new Burger("Classic", 3.5);
		//		burger.addToppings("cheese", "bacon", "mayo");
		//		burger.printItem();

		//		MealOrder meal = new MealOrder();
		//		meal.addBurgerToppings("cheese", "bacon", "mayo");
		//		meal.setDrinkSize("large");
		//		meal.printItemizedList();

		//		MealOrder secondMeal = new MealOrder("turkey", "7up", "chili");
		//		secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
		//		secondMeal.setDrinkSize("small");
		//		secondMeal.printItemizedList();

		MealOrder deluxeMeal = new MealOrder("Deluxe", "7up", "chili");
		deluxeMeal.addBurgerToppings("lettuce", "cheese", "mayo", "avocado", "bacon");
		deluxeMeal.setDrinkSize("small");
		deluxeMeal.printItemizedList();
	}
}

class Item {
	private String type;
	private String name;
	private double price;
	private String size = "MEDIUM";

	public Item(String type, String name, double price) {
		this.type = type.toUpperCase();
		this.name = name.toUpperCase();
		this.price = price;
	}

	public String getName() {
		if (type.equals("SIDE") || type.equals("DRINK")) {
			return size + " " + name;
		}
		return name;
	}

	public double getBasePrice() {
		return price;
	}

	public double getAdjustedPrice() {
		return switch (size) {
			case "SMALL" -> getBasePrice() - 0.5;
			case "LARGE" -> getBasePrice() + 1;
			default -> price;
		};
	}

	public void setSize(String size) {
		this.size = size.toUpperCase();
	}

	public static void printItem(String name, double price) {
		System.out.printf("%20s:%6.2f€%n", name, price);
	}

	public void printItem() {
		printItem(getName(), getAdjustedPrice());
	}
}

class MealOrder {
	private Burger burger;
	private Item drink;
	private Item side;

	public MealOrder() {
		this("Classic", "Coke", "Fries");
	}

	public MealOrder(String burgerType, String drinkType, String sideType) {
		if (burgerType.equalsIgnoreCase("Deluxe")) {
			this.burger = new DeluxeBurger(burgerType, 8.5);
		} else {
			this.burger = new Burger(burgerType, 4);
		}
		this.drink = new Item("Drink", drinkType, 1);
		this.side = new Item("Side", sideType, 1.5);
	}

	public double getTotalPrice() {
		if (burger instanceof DeluxeBurger) {
			return burger.getAdjustedPrice();
		}
		return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
	}

	public void printItemizedList() {
		burger.printItem();

		if (burger instanceof DeluxeBurger) {
			Item.printItem(drink.getName(), 0);
			Item.printItem(side.getName(), 0);
		} else {
			drink.printItem();
			side.printItem();
		}
		System.out.println("-".repeat(30));
		Item.printItem("TOTAL PRICE", getTotalPrice());
	}

	public void addBurgerToppings(String extra1, String extra2, String extra3) {
		burger.addToppings(extra1, extra2, extra3);
	}

	public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
		if (burger instanceof DeluxeBurger db) {
			db.addToppings(extra1, extra2, extra3, extra4, extra5);
		} else {
			burger.addToppings(extra1, extra2, extra3);
		}
		burger.addToppings(extra1, extra2, extra3);
	}

	public void setDrinkSize(String size) {
		drink.setSize(size);
	}

}

class Burger extends Item {
	private Item extra1;
	private Item extra2;
	private Item extra3;

	public Burger(String name, double price) {
		super("Burger", name, price);
	}

	@Override
	public String getName() {
		return super.getName() + " BURGUER";
	}

	@Override
	public double getAdjustedPrice() {
		return super.getAdjustedPrice() + ((extra1 != null ? extra1.getAdjustedPrice() : 0) + (extra2 != null ? extra2.getAdjustedPrice() : 0) + (extra3 != null ? extra3.getAdjustedPrice() : 0));
	}


	public double getExtraPrice(String toppingName) {
		return switch (toppingName.toUpperCase()) {
			case "CHEESE", "AVOCADO" -> 1;
			case "BACON", "HAM", "SALAMI" -> 1.5;
			default -> 0;
		};
	}

	public void addToppings(String extra1, String extra2, String extra3) {
		this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
		this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
		this.extra3 = new Item("Topping", extra3, getExtraPrice(extra3));
	}

	public void printItemizedList() {
		printItem("BASE BURGUER", getBasePrice());
		if (extra1 != null) {
			extra1.printItem();
		}
		if (extra2 != null) {
			extra2.printItem();
		}
		if (extra3 != null) {
			extra3.printItem();
		}
	}

	@Override
	public void printItem() {
		printItemizedList();
		System.out.println("-".repeat(30));
		super.printItem();
	}
}

class DeluxeBurger extends Burger {
	Item deluxe1;
	Item deluxe2;

	public DeluxeBurger(String name, double price) {
		super(name, price);
	}


	public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
		super.addToppings(extra1, extra2, extra3);
		deluxe1 = new Item("TOPPING", extra4, 0);
		deluxe2 = new Item("TOPPING", extra5, 0);
	}

	@Override
	public void printItemizedList() {
		super.printItemizedList();
		if (deluxe1 != null) {
			deluxe1.printItem();
		}
		if (deluxe2 != null) {
			deluxe2.printItem();
		}
	}

	@Override
	public double getExtraPrice(String toppingName) {
		return 0;
	}
}
