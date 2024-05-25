package s4_oop_1_inheritance;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.describeCar();
		System.out.println("make: " + car.getMake());
		System.out.println("model: " + car.getModel());
		System.out.println("color: " + car.getColor());
		System.out.println("doors: " + car.getDoors());
		System.out.println("convertible: " + car.isConvertible());

		System.out.println();

		car.setMake("Ferrari");
		car.setModel("F430");
		car.setColor("Yellow");
		car.setDoors(2);
		car.setConvertible(true);
		car.describeCar();

		//		Car car2 = new Car("Porsche", "911", "Blue", 2, true);

	}
}

class Car {
	private String make = "Seat";
	private String model = "Panda";
	private String color = "Red";
	private int doors = 5;
	private boolean convertible;


	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setMake(String make) {
		String lowercaseMake = make.toLowerCase();
		if (make == null || make.isEmpty()) {
			this.make = "Unknown";
		}
		switch (lowercaseMake) {
			case "seat", "porsche", "ferrari" -> this.make = make;
			default -> {
				this.make = "Unsupported";

			}
		}
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public void describeCar() {
		System.out.println("This car is a " + color + " " + make + " " + model + " with " + doors + " doors." + (convertible ? " Convertible." : ""));
	}


}

