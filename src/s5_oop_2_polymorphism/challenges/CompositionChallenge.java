package s5_oop_2_polymorphism.challenges;

public class CompositionChallenge {
	public static void main(String[] args) {
		SmartKitchen kitchen = new SmartKitchen();

//		kitchen.getDishMaster().setHasWorkToDo(true);
//		kitchen.getIceBox().setHasWorkToDo(true);
//		kitchen.getBrewMaster().setHasWorkToDo(true);
//
//		kitchen.getDishMaster().doDishes();
//		kitchen.getIceBox().orderFood();
//		kitchen.getBrewMaster().brewCoffee();

		kitchen.setKitchenState(true, false, true);
		kitchen.doKitchenWork();

	}
}


class SmartKitchen {
	private CofferMaker brewMaster;
	private Refrigerator iceBox;
	private Dishwasher dishMaster;

	public SmartKitchen() {
		brewMaster = new CofferMaker();
		iceBox = new Refrigerator();
		dishMaster = new Dishwasher();

	}

//	public CofferMaker getBrewMaster() {
//		return brewMaster;
//	}
//
//	public Refrigerator getIceBox() {
//		return iceBox;
//	}
//
//	public Dishwasher getDishMaster() {
//		return dishMaster;
//	}

	public void setKitchenState(boolean coffeeFlag, boolean foodFlag, boolean dishesFlag) {
		brewMaster.setHasWorkToDo(coffeeFlag);
		iceBox.setHasWorkToDo(foodFlag);
		dishMaster.setHasWorkToDo(dishesFlag);
	}

	public void doKitchenWork() {
		brewMaster.brewCoffee();
		iceBox.orderFood();
		dishMaster.doDishes();
	}
}

class Refrigerator {

	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void orderFood() {
		if (hasWorkToDo) {
			System.out.println("ordering food...");
			hasWorkToDo = false;
		} else {
			System.out.println("No work to do.");
		}
	}

}

class Dishwasher {
	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void doDishes() {
		if (hasWorkToDo) {
			System.out.println("Washing dishes...");
			hasWorkToDo = false;
		} else {
			System.out.println("No work to do.");
		}
	}

}

class CofferMaker {
	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void brewCoffee() {
		if (hasWorkToDo) {
			System.out.println("Brewing coffee...");
			hasWorkToDo = false;
		} else {
			System.out.println("No work to do.");
		}
	}
}